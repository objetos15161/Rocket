import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sabio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sabio extends Player
{
    private GreenfootImage sab=new GreenfootImage("cerebro.png");
    private GreenfootImage sabio =new GreenfootImage("spr_sadlady_0.png");
    
    public void act() 
    {
      if (isTouching(Player.class))
    {
               Greenfoot.delay(2);
                    setImage(sab);
               setLocation(97,500);
            } 
      else
      {  
          Greenfoot.delay(2);
                    setImage(sabio);
               setLocation(17,525);
        
        
    } 
    }
    }    

