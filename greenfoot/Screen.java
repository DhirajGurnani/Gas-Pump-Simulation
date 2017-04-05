import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    /**
     * Act - do whatever the Screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Screen(){
         GreenfootImage image = getImage() ;
        image.scale( 600, 450 ) ;
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
