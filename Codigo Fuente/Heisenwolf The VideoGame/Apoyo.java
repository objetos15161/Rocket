import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apoyo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apoyo extends Player
{
    /**
     * Act - do whatever the Apoyo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage apoyo =new GreenfootImage("spr_helpgirl_0.png");
   // private String unMensaje;
    
    private GreenfootImage apo=new GreenfootImage("eres.png");
    public void act() 
    {
      if (isTouching(Player.class))
    {
               Greenfoot.delay(2);
                    setImage(apo);
               setLocation(585,500);
            } 
      else
      {  
          Greenfoot.delay(2);
                    setImage(apoyo);
               setLocation(500,525);
        
        
    } 
    }
    
    }    

