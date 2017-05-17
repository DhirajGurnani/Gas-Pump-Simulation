import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Date;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

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
    private State welcomeState;
    private State validateCard;
    private State fuelState;
    private State pumping;
    private State additionalServices;
    private State askingprintreceipt;
    private State thankyoustate;
    private State billState;
    private KeyPad keyPad;   
    private Double totalPrice;
    private HashSet<String> services ;
    
    static String fueltypeSelected;
    boolean printCheck = false;
    boolean pumpingDone = false;
    static double gallonsFilled;
    static int currentScenario = 1;
    static State currentState ;
    
    public StatesImplementation(){
        GreenfootImage image = getImage() ;
        image.scale( 600, 470 ) ;
        welcomeState = new WelcomeState(this);
        validateCard = new ValidateCardState(this);
        fuelState = new FuelState(this);
        pumping = new PumpingState(this);
        additionalServices = new AdditionalServicesState(this);
        askingprintreceipt = new AskingPrintReceiptState(this);
        thankyoustate = new ThankYouState(this);
        billState = new BillState(this);
        this.currentState = welcomeState;
        services = new HashSet<>();
    }
    
    public int scenario(){
        return currentScenario;
        
    }
    
    public void setCurrentState(State updatedState){
        this.currentState = updatedState;
        setStateMessages();

        if(this.currentState instanceof WelcomeState){
            Greenfoot.setWorld(new GasPump());
        }else if(this.currentState instanceof ValidateCardState && getWorld().getObjects(Scenario.class).size() != 0){
            Scenario scenario = getWorld().getObjects(Scenario.class).get(0);
            getWorld().removeObject(scenario);
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
    
    public HashSet getServices(){
        return services;
    }
    
    public void setServices(HashSet<String> ser){
        services = ser;
    }
    
    public void act()
    {
        // Add your action cod  e here.
    }
    
    public void setKeyPad(KeyPad keyPad){        
        this.keyPad = keyPad;
    }
    
    public KeyPad getKeyPad(){
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
    
    public double getGallonsFilled() {
        return gallonsFilled;

    }

    public void setGallonsFilled(double gallonsFilled) {
        this.gallonsFilled = gallonsFilled;
    }

    public String getFueltypeSelected() {
        return fueltypeSelected;
    }

    public void setFueltypeSelected(String fueltypeSelected) {
        this.fueltypeSelected = fueltypeSelected;
    }
    
    public Double getTotalPrice(){
        return totalPrice;
    }
    
    public void setTotalPrice(Double price){
        totalPrice = price;
    }
    
    public void showReceipt(){
        World world = getWorld();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Random random = new Random();
        StringBuilder str = new StringBuilder();
        str.append("            Scorpion Gas Pump\n San Fernando Street, San Jose\n");
        str.append("\n                Sale Receipt\n\n");
        Date date = new Date();
        str.append(" Date                       Time\n");
        str.append("\t " + dateFormat.format(date) + "            " + timeFormat.format(date)+ "\n\n");
        str.append("\tInvoice# " + random.nextInt(1000000) + "\n");
        str.append("\tMastercard \n\tAccount Number  **********19 \n\n");
        str.append("\tGallons     Fuel Type     Amount\n");
        str.append("\t%s              \t%s                  $ %s\n\n");
        str.append("%s");
        
        StringBuilder servicesBill = new StringBuilder();
        Double servicePrice = 0.0;
        if(!services.isEmpty()){
            servicesBill.append("\tAdditional Services\n");
            for(String x: services){
                if(x == "Car Wash"){
                    servicesBill.append("\t" + x + "                        $ 15.00\n");
                    servicePrice = 15.00;
                } else if(x == "Car Maintainence"){
                    servicesBill.append("\t" + x + "           $ 50.00\n");
                    servicePrice = 50.00;                    
                } else {
                    servicesBill.append("\t" + x + "                          $ 00.00\n");
                    servicePrice = 00.00;                    
                }
            }
            servicesBill.append("\n\n");
        }
        str.append("\tTotal                                  $ %s\n\n");
        str.append("            THANK YOU!");
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        totalPrice = Double.valueOf(fmt.format(totalPrice));
        Double fuelPart = Double.valueOf(fmt.format(totalPrice-servicePrice));
        
        String finalReceipt = String.format(str.toString(), gallonsFilled+"", fueltypeSelected+"", fuelPart+"", servicesBill.toString(), totalPrice+"");  
        world.addObject( new Receipt(finalReceipt), 992, 250) ;
    }
}
