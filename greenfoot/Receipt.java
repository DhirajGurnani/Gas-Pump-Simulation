import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends StatesImplementation
{
    private GreenfootImage image;
    
    public Receipt(String message){
        image = new GreenfootImage(220, 350);
        setImage(image);
        image.setColor(new Color(250,235,215));
        image.setFont(new Font(12));
        image.fill(); 
        image.setColor(Color.BLACK);
        image.drawString(message, 20, 30);
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
