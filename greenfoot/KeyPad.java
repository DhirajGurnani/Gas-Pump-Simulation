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
    
    public KeyPad(){
        GreenfootImage image = new  GreenfootImage(150, 200);
        image.setColor(Color.GRAY);
        image.fill();
        setImage(image);
        text = "Enter zip code \n\n";
        underLines = "\n__ __ __ __ __";
        inputZip = "";
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

        if(inputZip.length() >= 12){
            return;
        }
        if(str.equals("-1"))
        {
            inputZip = inputZip.substring(0, inputZip.length()-1);
        }else if(!str.equals(""))
        {
            inputZip = inputZip + " " + str;
        }else 
        {
            System.out.println(currentState);
            currentState.onButtonClick(12);
        }
        
        System.out.println(text + inputZip + underLines);
        msg.setText(text+ inputZip + underLines);
    }
    
    public String getZipCode(){
        return inputZip;
    }
    
        
}
