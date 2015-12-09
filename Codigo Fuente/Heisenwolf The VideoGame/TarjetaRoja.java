import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TarjetaRoja here.
 * 
 * @author Cesar Mondragon Martin  
 * @version 04-12-2015
 */
public class TarjetaRoja extends Bonus
{
    public TarjetaRoja()
    {
     
    }
    
    public void act() 
    {
        if(isTouching(Player.class))
        {
            getWorld().removeObject(this);
        }
    }
}
