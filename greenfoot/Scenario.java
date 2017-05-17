import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Scenario1 here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Scenario extends StatesImplementation
{
    private GreenfootImage image;
    /**
     * Act - do whatever the Scenario1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Scenario()
    {
        image = new GreenfootImage("scenario.png");
        setImage(image);
    }
    public void act() 
    {
        
   MouseInfo mouse = Greenfoot.getMouseInfo();
    
        // Add your action code here.
        if (Greenfoot.mouseClicked(this) && (currentState instanceof WelcomeState))
        {
            if((mouse.getX()>829 && mouse.getX()<881) && (mouse.getY()>150 && mouse.getY()< 254)){
            currentScenario = 1;
            
            if (Greenfoot.mouseClicked(this)){
               getWorld().removeObject(this);
            }    
        }else if((mouse.getX()>882 && mouse.getX()<934) && (mouse.getY()>150 && mouse.getY()< 280)){
            currentScenario = 2;
            
            if (Greenfoot.mouseClicked(this)){
               getWorld().removeObject(this);
            }   
        }else if((mouse.getX()>934 && mouse.getX()<986) && (mouse.getY()>150 && mouse.getY()< 280)){
            currentScenario = 3;
            
            if (Greenfoot.mouseClicked(this)){
               getWorld().removeObject(this);
            }    
        
        }else{
            
            currentScenario = 1;
            if (Greenfoot.mouseClicked(this)){
               getWorld().removeObject(this);
            }
        }
        }
    }    
    
   /* public Scenario(){
        GreenfootImage image = new  GreenfootImage("images.jpeg");
        image.scale(300, 200);
        setImage(image);
    }*/
    
    
}