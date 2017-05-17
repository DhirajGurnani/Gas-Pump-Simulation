    /**
 * Write a description of class FuelState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class FuelState implements State 
{
    // instance variables - replace the example below with your own
    
    StatesImplementation statesImplementation;
    
    
    public FuelState(StatesImplementation statesImplementation){
        this.statesImplementation = statesImplementation;
    }
   
    
   public String getMessage(){
       return "Please select one of the Fuel Type";
   }
    
   public void setState(){
       statesImplementation.setCurrentState(statesImplementation.getPumpingState());
   }
   
   public State getCurrentState(){
       return statesImplementation.getCurrentState();
   }
        
   public void onButtonClick(int buttonId){
       switch(buttonId){
            case 1:
                System.out.println("Button 1");
                break;
            case 2:
                System.out.println("Button 2");
                break;
            case 3:
                System.out.println("Button 3");
                break;
            case 4:
                System.out.println("Button 4");
                break;
            case 5:
                System.out.println("Button 5");
                break;
            case 6:
                System.out.println("Button 6");
                break;                
            case 7:
                System.out.println("Button 7");
                break;                
            case 8:
                System.out.println("Button 8 - Cancel");
                statesImplementation.setCurrentState(statesImplementation.getWelcomeState());
                break;                
            default:
                System.out.println("Default");
                break;                
        }
   }
}
