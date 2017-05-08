import greenfoot.*; 
 
public class Message extends Actor
{   
   

    private GreenfootImage image;
    private int msgX;   //Add coordinates to the variables 
    private int msgY; 
    

    public Message()
    {
        image = new GreenfootImage(100, 50);
        setImage(image);
        setText("Welcome");
        System.out.println("const");
    }
    
    /*public Message(String message)
    {
        this.currentMsg = message;
        image = new GreenfootImage(100, 50);
        setImage(image);
        setText(message) ;

    }*/
    
    
    public void setText(String msg)
    {
        //System.out.println(msg);
        image.clear();
        image.setColor(greenfoot.Color.PINK);
        image.fill(); 
        image.setColor(greenfoot.Color.BLACK);
        image.drawString(msg, 10, 50);
    }
    
}