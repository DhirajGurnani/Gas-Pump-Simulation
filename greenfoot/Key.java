import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends KeyPad
{
    private static GreenfootImage[] images = { new GreenfootImage("KeyPad0.png"), new GreenfootImage("KeyPad1.png"),
                                       new GreenfootImage("KeyPad2.png"),
                                       new GreenfootImage("KeyPad3.png"),
                                       new GreenfootImage("KeyPad4.png"),
                                       new GreenfootImage("KeyPad5.png"),
                                       new GreenfootImage("KeyPad6.png"),
                                       new GreenfootImage("KeyPad7.png"),
                                       new GreenfootImage("KeyPad8.png"),
                                       new GreenfootImage("KeyPad9.png"),
                                       new GreenfootImage("clear.png"),
                                       new GreenfootImage("Enter.png")};
    
    public Key(){}
    
    public Key(int button){
        GreenfootImage image = images[button];
        image.scale(30, 30);
        setImage(image);
    }
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
