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
        
       // image.setColor(greenfoot.Color.PINK);
        image.setColor(new Color(34,34,51));
        image.setFont(new Font(18));
        image.fill(); 
        image.setColor(new Color(235,201,148));
        image.drawString(msg, 130, 150);  
    }
    
    public void setStateButtonText(State state){
        System.out.println("Setting button text "+ state); 
        if(state instanceof ValidateCardState){
            image.setColor(new Color(235,201,148));
            // Left side four buttons
           /* image.drawString("<< Start", 10, 50);            
            image.drawString("<< End", 10, 150);
            image.drawString("<< Start", 10, 250);
            image.drawString("<< End", 10, 350);*/
            
            // Right side four buttons
            /*image.drawString("Start >>", 460, 50);            
            image.drawString("End >>", 460, 150);
            image.drawString("Start >>", 460, 250);
            image.drawString("Retry >>", 460, 350);*/            
        }
        if(state instanceof FuelState){
              image.setColor(new Color(235,201,148));
              image.drawString("Cancel >>", 430, 350);
         }
        if(state instanceof PumpingState){
            image.setColor(new Color(235,201,148));
            // Left side four buttons
           /* image.drawString("<< Start", 10, 50);            
            image.drawString("<< End", 10, 150);
            image.drawString("<< Start", 10, 250);
            image.drawString("<< End", 10, 350);*/
            
            // Right side four buttons
            /*image.drawString("Start >>", 460, 50);            
            image.drawString("End >>", 460, 150);
            image.drawString("Start >>", 460, 250);*/
            image.drawString("Proceed >>", 420, 350);            
        }
           
        if(state instanceof AdditionalServicesState){
            image.setColor(new Color(235,201,148));
            // Left side four buttons
           /* image.drawString("<< Start", 10, 50);            
            image.drawString("<< End", 10, 150);*/
            image.drawString("<< Car Wash", 10, 250);
            image.drawString("<< Car Maintenance", 10, 350);
            
            // Right side four buttons
           /* image.drawString("Start >>", 460, 50);            
            image.drawString("End >>", 460, 150);*/
			image.drawString("Air Filling >>", 410, 250);
            image.drawString("None >>", 440, 350);            
        }
        
        if(state instanceof AskingPrintReceiptState){
            image.setColor(new Color(235,201,148));
            // Left side four buttons
           /* image.drawString("<< Start", 10, 50);            
            image.drawString("<< End", 10, 150);
            image.drawString("<< Car Wash", 10, 250);
            image.drawString("<< Car Maintenance", 10, 350);*/
            
            // Right side four buttons
           /* image.drawString("Start >>", 460, 50);            
            image.drawString("End >>", 460, 150);*/
            image.drawString("Yes >>", 450, 250);
            image.drawString("No >>", 460, 350);
        }
        
                if(state instanceof BillState){
            image.setColor(new Color(235,201,148));
            // Left side four buttons
           /* image.drawString("<< Start", 10, 50);            
            image.drawString("<< End", 10, 150);
            image.drawString("<< Car Wash", 10, 250);
            image.drawString("<< Car Maintenance", 10, 350);*/
            
            // Right side four buttons
           /* image.drawString("Start >>", 460, 50);            
            image.drawString("End >>", 460, 150);*/
            //image.drawString("Yes >>", 450, 250);
            image.drawString("Next >>", 460, 350);              

        }
    }
    
}