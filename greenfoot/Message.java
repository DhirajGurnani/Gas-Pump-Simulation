import greenfoot.*; 
 
public class Message extends Actor
{   
   
{
    private GreenfootImage image;
    private int msgX;   //Add coordinates to the variables 
    private int msgY; 
    String currentMsg;

    public Message(String message)
    {
        this.currentMsg = message;
        image = new GreenfootImage(100, 50);
        setImage(image);
        setText(message) ;
    }
    
    
    public void setText(String msg)
    {
        image.clear();
        image.setColor(greenfoot.Color.PINK);
        image.fill(); 
        image.setColor(greenfoot.Color.BLACK);
        image.drawString(msg, 10, 50);
    
}