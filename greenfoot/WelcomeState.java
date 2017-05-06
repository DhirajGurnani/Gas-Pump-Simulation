/**
 * Write a description of class WelcomeState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeState implements State 
{
    // instance variables - replace the example below with your own
   GasPumpMachine gasPump;
   
   public WelcomeState(GasPumpMachine machine){
       this.gasPump = machine;
    }
   
   public void screenSetup(){
       gasPump.msg.setText("Welcome");
    };
    
   public void btnSetUp(){
    };
    
   public void setMessage(){
    };
   public void setGasNumber(){};
   public void setKepPad(){};
   public void setCreditCard(){};
 
   public void setUpNozzle(){};
     public void selectReceipt(){};
   
   
}
