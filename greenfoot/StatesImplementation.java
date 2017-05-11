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
    State additionalServices;
    State askingprintreceipt;
    State thankyoustate;
    State billState;
    static State currentState ;
    World world;
    private KeyPad keyPad;
    public boolean pumping_done = false;
    static double gallon_filled;
    static String fueltype_selected;
    static boolean wash_service =  false;
    static boolean air_service = false;
    static boolean maintenance_service = false;
    //Double totalprice = 0.0;
    //private Message msg;
    static int currentScenario;
    
    public StatesImplementation(){
        GreenfootImage image = getImage() ;
        image.scale( 600, 470 ) ;
        world = getWorld();
        welcomeState = new WelcomeState(this);
        validateCard = new ValidateCardState(this);
        fuelState = new FuelState(this);
        pumping = new PumpingState(this);
        additionalServices = new AdditionalServicesState(this);
        askingprintreceipt = new AskingPrintReceiptState(this);
        thankyoustate = new ThankYouState(this);
        billState = new BillState(this);
        this.currentState = welcomeState;
        
    }
    
    public int scenario(){
        return currentScenario;
        
    }
    
    public void setCurrentState(State updatedState){
        System.out.println("Current state updated "+ updatedState);
        this.currentState = updatedState;
        setStateMessages();
        if(this.currentState instanceof WelcomeState){
            Greenfoot.setWorld(new GasPump());
        }
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
    
    public State getBillState(){
        return this.billState;
        
    }
    
    public State getAdditionalServicesState(){
        return this.additionalServices;
        
    }
    
    public State getWelcomeState(){
        return this.welcomeState;
        
    }
    
    
    public State getAskingPrintReceiptState(){
        return this.askingprintreceipt;
        
    }
    
    public State getThankYouState(){
        return this.thankyoustate;
        
    }
    
    public String getText(){
        return currentState.getMessage();
        
    }
    
    public  void setWash(){
        wash_service = true;
    }
    
    
    public  void setAir(){
        air_service = true;
    }
    
    
    public  void setMaintainecne(){
        maintenance_service = true;
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
    
    public void setStateMessages(){
        Message   msg = (Message) getWorld().getObjects(Message.class).get(0);
        msg.setText(currentState.getMessage());        
        msg.setStateButtonText(currentState);
        
    }
    
    public void setCancelMessage(){
        Message   msg = (Message) getWorld().getObjects(Message.class).get(0);
        msg.setCancelMessage(this.currentState);
    }
    
    public double getGallon_filled() {
        		System.out.println(gallon_filled);
		return gallon_filled;

	}

	public void setGallon_filled(double gallon_filled) {
		this.gallon_filled = gallon_filled;
	}

	public String getFueltype_selected() {
		return fueltype_selected;
	}

	public void setFueltype_selected(String fueltype_selected) {
		this.fueltype_selected = fueltype_selected;
	}

	public boolean isWash_service() {
	    System.out.println(wash_service);
		return wash_service;
	}

	public boolean isAir_service() {
	    System.out.println(air_service);
		return air_service;
	}

	public boolean isMaintenance_service() {
	    System.out.println(maintenance_service);
		return maintenance_service;
	}

}
