import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ogro here.
 * 
 * @author Cesar Mondragon Martin  
 * @version 04-12-2015
 */
public class Ogro extends Enemy
{
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage []moveRight;
    private GreenfootImage []moveLeft;
    
    private GreenfootImage walkRight1=new GreenfootImage("spr_grav_right.png");
    private GreenfootImage walkRight2=new GreenfootImage("spr_grav_right.png");
    private GreenfootImage walkRight3=new GreenfootImage("spr_grav_right.png");
    private GreenfootImage walkRight4=new GreenfootImage("spr_grav_right.png");
    
    private GreenfootImage walkLeft1=new GreenfootImage("spr_grav_0.png");
    private GreenfootImage walkLeft2=new GreenfootImage("spr_grav_0.png");
    private GreenfootImage walkLeft3=new GreenfootImage("spr_grav_0.png");
    private GreenfootImage walkLeft4=new GreenfootImage("spr_grav_0.png");
    
    
    private int countMoveRight;
    private int countMoveLeft;
    private String direction;
    
    private int health;
    private Bonus bonus;
    //private boolean dead;
    
    public Ogro()
    {
        moveRight=new GreenfootImage[4];
        moveLeft=new GreenfootImage[4];
        
        moveRight[0]=walkRight1;
        moveRight[1]=walkRight2;
        moveRight[2]=walkRight3;
        moveRight[3]=walkRight4;
        
        moveLeft[0]=walkLeft1;
        moveLeft[1]=walkLeft2;
        moveLeft[2]=walkLeft3;
        moveLeft[3]=walkLeft4;
        
        countMoveRight=0;
        countMoveLeft=0;
        
        direction="Right";
        
        //dead=false;
        health=3;
    }
    
    public void act() 
    {
       //if(getX()<190)
       /*if(isTouching(Block.class)!=true)
       {
           direction="Left";
       }
       
       //if(getX()>525)
       if(isTouching(BlockLeft.class) && isTouching(Block.class))
       {
           direction="Right";
       }*/
        
       if(direction=="Left")// && isTouching(Block.class))
       {
           if(countMoveLeft>3)
           {
               countMoveLeft=0;
           }
           
           setLocation(getX()-5,getY());
           setImage(moveLeft[countMoveLeft]);
           countMoveLeft++;
           
           if(isTouching(Block.class)!=true || isAtEdge() || isTouching(BlockLeft.class))
           {
               direction="Right";
           }
       }
       
       if(direction=="Right")// && isTouching(Block.class))
       {
           if(countMoveRight>3)
           {
               countMoveRight=0;
           }
           
           setLocation(getX()+5,getY());
           setImage(moveRight[countMoveRight]);
           countMoveRight++;
           
           if(isTouching(Block.class)!=true || isAtEdge() || isTouching(BlockRight.class))
           {
               direction="Left";
           }
       }
       
       if(isTouching(SnowBall.class))
       {
           health--;
           removeTouching(SnowBall.class);
       }
       
       if(health==0)
       {
           //this.dead=true;
           int rnd=Greenfoot.getRandomNumber(3);
            
           switch(rnd)
           {
               case 0:
               bonus=new TarjetaAzul();
               break;
                
               case 1:
               bonus=new Door();
               break;
                
               case 2:
               bonus=new TarjetaRoja();
               break;
           }
            
           getWorld().addObject(bonus,getX(),getY());
           getWorld().removeObject(this);
       }
    }
    
    /*public boolean isDead()
    {
       return dead;
    }
    
    public void setDead(boolean isDead)
    {
        dead=isDead;
    }*/
}
