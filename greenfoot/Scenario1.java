import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scenario1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scenario1 extends StatesImplementation
{
    /**
     * Act - do whatever the Scenario1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 

   
    public void act() 
    {
   
    
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            currentScenario = 1;
            System.out.println("scenario 1 selected");
            
            if (Greenfoot.mouseClicked(this)){
                
               getWorld().removeObject(this);
               
        }    
            
        }
    }    
    
    public Scenario1(){
        GreenfootImage image = new  GreenfootImage("1_s.png");
        image.scale(30, 30);
        setImage(image);
    }
} 