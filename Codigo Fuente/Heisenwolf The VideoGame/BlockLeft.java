import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Este bloque se utiliza para construir plataformas,y ser un borde de una de ellas,para evitar el paso del jugador;
 * 
 * @author Cesar Mondragon Martin  
 * @version 04-12-2015
 */
public class BlockLeft extends Actor
{
    /**
     * Act - do whatever the BlockTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**
     * Constructor de la clase BlockLeft
     * Dibuja el objeto en pantalla
     */
    public BlockLeft()
    {
        dibujar();
    }
    
    public void act() 
    {
        
    }
    
    /**
     * Le asigna una imagen al objeto.
     */
    public void dibujar()
    {
        GreenfootImage imagen;
        imagen=new GreenfootImage("block.png");
        this.setImage(imagen);
    }
}
