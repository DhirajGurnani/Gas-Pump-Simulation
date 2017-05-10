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
    State fuelState;
    State pumping;
    static State currentState ;
    World world;
    private KeyPad keyPad;
    
    public StatesImplementation(){
        GreenfootImage image = getImage() ;
        image.scale( 600, 470 ) ;
        world = getWorld();
        welcomeState = new WelcomeState(this);
        validateCard = new ValidateCardState(this);
        fuelState = new FuelState(this);
        pumping = new PumpingState(this);
        this.currentState = welcomeState;
    }
    
    public void init(){
        Message msg = (Message) getWorld().getObjects(Message.class).get(0);
        msg.setText(currentState.getMessage());
    }
    
    
    public void setCurrentState(State updatedState){
        System.out.println("Current state updated "+ updatedState);
        this.currentState = updatedState;
        init();
    }
    
    public State getCurrentState(){
        return this.currentState;
    }
    
    public State getValidateCardState(){
        return this.validateCard;
        
    }
    
    public State getFuelState(){
        return this.fuelState;
        
    }
    
    public State getPumpingState(){
        return this.pumping;
        
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
    
    public void setKeyPad(KeyPad keyPad){
        System.out.println("Setting " + keyPad);        
        this.keyPad = keyPad;
    }
    
    public KeyPad getKeyPad(){
        System.out.println("Return " + this.keyPad);
        return this.keyPad;
    }
    
}
