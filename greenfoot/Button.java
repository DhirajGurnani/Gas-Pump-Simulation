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
           
        GasPump gb = (GasPump)getWorld();
       // System.out.println(gb.getState());
        currentState =  gb.getState();
         System.out.println(currentState.getClass());
         currentState.setCurrentState(currentState.getValidateCardState());
         currentState.setMessage("tmkc tmkb");
        }
        // Add your action code here.
    }    
}
