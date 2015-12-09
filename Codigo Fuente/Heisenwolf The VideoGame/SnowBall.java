import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea un objeto snowball y actua segun la direccion;
 * 
 * @author Cesar Mondragon Martin  
 * @version 04-12-2015
 */
public class SnowBall extends Actor
{
    private String shootDirection;
    
    /**
     * Constructor de la clase SnowBall,recibe como parametro una direccion para disparar en direccion
     * derecha o izquierda
     */
    public SnowBall(String aDirection)
    {
        shootDirection=aDirection;
    }
    
    /**
     * Agrega un objeto SnowBall al mundo
     */
    public void act() 
    {
        if(shootDirection=="right")
        {
            setLocation(getX()+25,getY());
        }
        
        else
        {
            setLocation(getX()-25,getY());
        }
        
        if(isAtEdge()|| isTouching(BlockLeft.class) || isTouching(BlockRight.class))
        {
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Verifica si el objeto esta tocando un Borde de la pantalla
     */
    public boolean isAtEdge()
    {
        HeisenWorld myWorld;
        myWorld=(HeisenWorld)getWorld();
        
        GreenfootImage myImage=this.getImage();
        
        if(getX()-myImage.getWidth()/2<=1 || getX()+myImage.getWidth()>=myWorld.getWidth())
        {
            return(true);
        }
        
        return(false);
    }
}
