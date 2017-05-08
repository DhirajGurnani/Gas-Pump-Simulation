import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends StatesImplementation
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int stateNumber;
    //StatesImplementation state = new StatesImplementation();
    Message msg;
     public Button(){
         GreenfootImage image = getImage() ;
        image.scale( 40, 40 ) ;
     
    }
    
    public Button(int stateNumber){
         GreenfootImage image = getImage() ;
        image.scale( 40, 40 ) ;
        this.stateNumber = stateNumber;
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
           msg = (Message) getWorld().getObjects(Message.class).get(0);
           msg.setText(currentState.getMessage());
          // getWorld().addObject(msg, 300 , 40); 
          // currentState.setState();
        
        }
        // Add your action code here.
    }    
}
