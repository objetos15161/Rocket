import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TarjetaAzul here.
 * 
 * @author Cesar Mondragon Martin  
 * @version 04-12-2015
 */
public class TarjetaAzul extends Bonus
{
    public TarjetaAzul()
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
