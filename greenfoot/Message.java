import greenfoot.*; 
 
public class Message extends Actor
{   
   

    private GreenfootImage image;
    private int msgX;   //Add coordinates to the variables 
    private int msgY; 
    

    public Message()
    {
        image = new GreenfootImage(520, 400);
        setImage(image);
      //  setText("Welcome");
      //  System.out.println("const");
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
        image.drawString(msg, 180, 150);  
    }
    
    public void setStateButtonText(State state){
        System.out.println("Setting button text "+ state); 
        if(state instanceof ValidateCardState){
            image.setColor(greenfoot.Color.BLACK);
            // Left side four buttons
            /*image.drawString("<< Start", 10, 50);            
            image.drawString("<< End", 10, 150);
            image.drawString("<< Start", 10, 250);
            image.drawString("<< End", 10, 350);*/
            
            // Right side four buttons
            /*image.drawString("Start >>", 460, 50);            
            image.drawString("End >>", 460, 150);
            image.drawString("Start >>", 460, 250);*/
            image.drawString("Retry >>", 460, 350);            
        }
    }
    
}