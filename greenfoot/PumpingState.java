/**
 * Write a description of class PumpingState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PumpingState  implements State 
{
    // instance variables - replace the example below with your own

    StatesImplementation statesImplementation;
    //Message msg;
    
    public PumpingState(StatesImplementation statesImplementation){
        this.statesImplementation = statesImplementation;
    }
   
    
   public String getMessage(){
       return "Click on Nozzle to Proceed Pumping";
   }
    
   public void setState(){
       statesImplementation.setCurrentState(statesImplementation.getAdditionalServicesState());
   }
   
   public State getCurrentState(){
       return statesImplementation.getCurrentState();
   }
        
   public void onButtonClick(int buttonId){
       System.out.println("Button click PumpingState "+ buttonId);
       // TODO Instead of setting the state here, set when credit card is on card reader
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
                //System.out.println("Button 8");
                if(statesImplementation.scenario() == 3 || statesImplementation.scenario() == 2){
                    statesImplementation.setCurrentState(statesImplementation.getAdditionalServicesState());
                }else{
                    statesImplementation.setCurrentState(statesImplementation.getBillState());
                }

                //statesImplementation.setCurrentState(statesImplementation.getAdditionalServicesState());

                break;                
            default:
                System.out.println("Default");
                break;                
        }
   }
}