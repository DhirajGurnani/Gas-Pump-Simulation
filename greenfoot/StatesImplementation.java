import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatesImplementation extends Actor implements State
{
    /**
     * Act - do whatever the GasPumpMachine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    State welcomeState;
    State validateCard;
    State currentState ;
   
    public StatesImplementation(){
           /* welcomeState = new WelcomeState(this);
            validateCard = new ValidateCardState(this);*/
          //  this.currentState = welcomeState;
        
    }
    
    public void init(){
        welcomeState = new WelcomeState(this);
            validateCard = new ValidateCardState(this);
            this.currentState = welcomeState;
    }
    
    public State getCurrentState(){
      return this.currentState;
        
    }
    
    public void setCurrentState(State updatedState){
       this.currentState = updatedState;
        
    }
    public void act() 
    {
        // Add your action cod  e here.
    }  
    
   public void btnSetUp(){};
   public void setMessage(String msg){
       currentState.setMessage(msg);
    }
   public void setGasNumber(){}
   public void setKepPad(){}
   public void setCreditCard(){}
   public void setUpNozzle(){}
   
      public State getValidateCardState(){
          return validateCard;
        }
}
