import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class KeyPad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyPad extends StatesImplementation
{ 
    private String text;
    private String underLines;
    String inputZip;
    private Message msg;
    private boolean isValid;
    private String validZip;
    
    public KeyPad(){
        GreenfootImage image = new  GreenfootImage(150, 200);
        image.setColor(Color.GRAY);
        image.fill();
        setImage(image);
        text = "Enter zip code \n\n";
        underLines = "\n_  _  _  _  _";
        inputZip = "";
        validZip = "12345";
    }
    /**
     * Act - do whatever the KeyPad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void updateText(String str)
    {
        if(msg == null){
            msg = (Message) getWorld().getObjects(Message.class).get(0);
            System.out.println(msg);
        }

        if(str.equals("-1"))
        {
            inputZip = inputZip.substring(0, inputZip.length() > 2 ? inputZip.length()-2 : inputZip.length()-1);
            setMessage(text + inputZip + underLines);
        }else if(!str.equals("") && inputZip.length() < 10)
        {
            inputZip = inputZip + " " + str;
            setMessage(text + inputZip + underLines);
        }else if(inputZip.length() == 10 && str.equals(""))
        {
            validateZip();
        }
    }
    
    public String getZipCode(){
        return inputZip;
    }
    
    private void validateZip(){
        inputZip = inputZip.replace(" ", "");
        if(inputZip.equals(validZip)){          
            currentState.setState();
            System.out.println(currentState);
            msg = (Message) getWorld().getObjects(Message.class).get(0);
            msg.setStateButtonText(currentState);
        }else {
            inputZip = "";
            setMessage("Credit card is not valid, retry\n\n" + text + underLines);
            setCancelMessage();
        }
    }
    
    private void setMessage(String str){
        if(currentState instanceof ValidateCardState){
            msg.setText(str);
        }
    }
        
}
