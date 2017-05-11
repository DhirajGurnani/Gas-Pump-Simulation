import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends StatesImplementation
{
    private GreenfootImage image;
    
    public Receipt(){
        image = new GreenfootImage(220, 300);
        setImage(image);
        image.setColor(new Color(250,235,215));
        image.setFont(new Font(12));
        image.fill(); 
        image.setColor(Color.BLACK);
        image.drawString("Print", 130, 150);
    }
    
    /**
     * Act - do whatever the Receipt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    
}
