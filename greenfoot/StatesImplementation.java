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
    State welcomeState;
    State validateCard;
    State fuelState;
    State pumping;
    State additionalServices;
    State askingprintreceipt;
    State thankyoustate;
    State billState;
    static State currentState ;
    private KeyPad keyPad;
    public boolean pumpingDone = false;
    static double gallonsFilled;
    static String fueltypeSelected;
    boolean printCheck = false;
    Double totalprice;
    //private Message msg;
    static int currentScenario = 1;
    HashSet<String> services ;
    
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
    
    public double getGallonsFilled() {
                System.out.println(gallonsFilled);
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
    
    public void showReceipt(){
        World world = getWorld();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Random random = new Random();
        StringBuilder str = new StringBuilder();
        str.append("\t\tScorpion Gas Pump\n\t San Fernando Street, San Jose\n");
        str.append("\n\t\tSale Receipt\n\n");
        Date date = new Date();
        str.append("\tDate\t\t\tTime\n");
        str.append("\t" + dateFormat.format(date) + " \t\t" + timeFormat.format(date)+ "\n\n");
        str.append("\tInvoice# " + random.nextInt(1000000) + "\n");
        str.append("\tMastercard \n\tAccount Number\t\t ***19 \n\n");
        str.append("\tGallons     Fuel Type     Amount\n");
        str.append("\t%s          %s               $");
        if(fueltypeSelected == "87"){
            Double halfAmount = 2.929*gallonsFilled;
                DecimalFormat fmt = new DecimalFormat("0.00");
        halfAmount =  Double.valueOf(fmt.format(halfAmount))  ;
       
            str.append(String.valueOf(halfAmount));
        }else if(fueltypeSelected == "89"){
            Double halfAmount = 3.129*gallonsFilled;
            
                DecimalFormat fmt = new DecimalFormat("0.00");
        halfAmount =  Double.valueOf(fmt.format(halfAmount))  ;
            str.append(String.valueOf(halfAmount));
        }else{
            Double halfAmount = 3.329*gallonsFilled;
            
                DecimalFormat fmt = new DecimalFormat("0.00");
        halfAmount =  Double.valueOf(fmt.format(halfAmount))  ;
            str.append(String.valueOf(halfAmount));
        }
        str.append("\n\n");
        if(!services.isEmpty()){
            str.append("Additional Services \n");
            for(String x: services){
                if(x == "Car Wash"){
            str.append(x + "              $15.00\n");
        } else if(x == "Car Maintainence"){
        str.append(x + "                  $50.00\n");

        } else {
        str.append(x + "                  $00.00\n");

        }

        }
            str.append("\n");
        }
        str.append("Total                       $%s\n");
        str.append("\t\tTHANK YOU!");
        
        String str1 = String.format(str.toString(), gallonsFilled+"", fueltypeSelected+"", totalprice+"");  
        world.addObject( new Receipt(str1), 992, 200) ;
    }
}
