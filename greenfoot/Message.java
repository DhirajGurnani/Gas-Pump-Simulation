import greenfoot.*; 
 
public class Message extends Actor
{   
    public Message(){
        displayText("");
    }
    
    public Message(String msg){
        displayText(msg);
    }
    
    public void setText(String msg)
    {
        displayText(msg);
    }
    
    public void displayText(String msg){
    GreenfootImage img = new GreenfootImage(200,190);//adjust coordinates
    img.setColor(greenfoot.Color.WHITE);
    img.fill();
    img.setColor(greenfoot.Color.YELLOW);
    img.drawString(msg,10,15);//adjust coordinates
    setImage(img); 
    
}
    
    
}