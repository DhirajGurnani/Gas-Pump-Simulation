import greenfoot.*; 
/**
 * Write a description of class message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class Message extends Actor
{
    private GreenfootImage image;
    private int msgX;   //Add coordinates to the variables 
    private int msgY;   

    public Message()
    {
    }
    
    public Message(int msgX, int msgY){
    }
    
    public void setText(String msg)
    {
        image.clear();
        image.setColor(greenfoot.Color.WHITE);
        image.fill();
        
        image.setColor(greenfoot.Color.BLACK);
        image.drawString(msg, msgX, msgY);
    }
    
    public void act()
    {
        if(Greenfoot.mousePressed(this)) 
        {
            World world = getWorld();
            world.removeObject(this);
        }
    }
    
}