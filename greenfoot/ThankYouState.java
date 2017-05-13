/**
 * Write a description of class ThankYouState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThankYouState implements State
{
    // instance variables - replace the example below with your own
    StatesImplementation statesImplementation;
    private String screenMessage;
    
    
    public ThankYouState(StatesImplementation statesImplementation){
      this.statesImplementation = statesImplementation;
      screenMessage = "Thank You";
    }
    
    public void setState(){
         // statesImplementation.setCurrentState(statesImplementation.getFuelState());
    }
    
    public State getCurrentState(){
       return statesImplementation.getCurrentState();
    }
    
    public String getMessage(){
        return screenMessage;
    }
    
    public void setStateMessages(){
    
    }
    
    public void onButtonClick(int buttonId){
        //System.out.println("Button clicked Validate "+ buttonId);
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
                System.out.println("Button c8");
                break;                
            default:
                System.out.println("Default");
                break;                
        }
    }
}
