import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author Cesar Mondragon Martin  
 * @version 04-12-2015
 */
public class Dragon extends Enemy
{
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**Declaration of instance variables */
    
    private GreenfootImage moveLeft,moveRight;; 
    
    /** the amount of change in x during each act */
    private int velX=5;
    
    /** the amount of change in y during each act */
    private int velY = 2;
    
    /**direction*/
    private int direction=0;
    
    public Dragon()
    {
        /*velX = Greenfoot.getRandomNumber(6) + 1;
        
        if (Greenfoot.getRandomNumber(6) == 0)
        {
            velX = -1 * velX;
        }*/
       
        moveRight=new GreenfootImage("spr_evilwiz_left.png");
        moveLeft=new GreenfootImage("spr_evilwiz_0.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        
        if(direction==0)
        {
            setLocation(getX()+velX,getY()+velY);
        }
        
        if(direction==1)
        {
            setLocation(getX()+velX,getY()-velY);
        }
       
        if(getX()>=785)
        {
            velX=-velX;
            setImage(moveLeft);
        }
        
        if(getX()<=15)
        {
            velX=velX+1;
            setImage(moveRight);
        }
        
        if(getY()>=550)
        {
            direction=1;
        }
        
        if(getY()<=80)
        {
            direction=0;
        }
        
        /*if(getY()+(radius/2)>=world.HEIGHT)
        {
            world.removeObject(this);
            world.newBall();
        }*/
    }    
}
