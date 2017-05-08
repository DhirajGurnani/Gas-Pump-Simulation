import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatesImplementation extends Actor 
{
    /**
     * Act - do whatever the GasPumpMachine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    State welcomeState;
    State validateCard;
    State currentState ;
    World world;
   
    public StatesImplementation(){
           world = getWorld();
//           System.out.println(world);
            welcomeState = new WelcomeState(this);
            validateCard = new ValidateCardState(this);
            this.currentState = validateCard;
        //    System.out.println(currentState.getClass());
        
    }
    
   /* public void init(){
        welcomeState = new WelcomeState(this);
            validateCard = new ValidateCardState(this);
            this.currentState = welcomeState;
            
    }*/
    
    
    public void setCurrentState(State updatedState){
      this.currentState = updatedState;
        
    }
    
    public State getValidateCardState(){
      return this.validateCard;
        
    }
    
    public State getWelcomeState(){
      return this.welcomeState;
        
    }
    public String getText(){
      return currentState.getMessage();
        
    }
    
    
    
    public void act() 
    {
        // Add your action cod  e here.
    }  
    
}