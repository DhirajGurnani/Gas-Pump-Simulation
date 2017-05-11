/**
 * Write a description of class AskingPrintReceiptState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AskingPrintReceiptState implements State
{
    // instance variables - replace the example below with your own
    StatesImplementation statesImplementation;
    private String screenMessage;
    
    
    public AskingPrintReceiptState(StatesImplementation statesImplementation){
      this.statesImplementation = statesImplementation;
      screenMessage = "Total Amount"+"\n"+"Do you want to print your receipt";
    }
    
    public void setState(){

          statesImplementation.setCurrentState(statesImplementation.getFuelState());

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
        System.out.println("Button clicked Validate "+ buttonId);
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

                if(statesImplementation.scenario() ==3 ){
                    statesImplementation.setCurrentState(statesImplementation.getFuelState());
                }else{
                    statesImplementation.setCurrentState(statesImplementation.getThankYouState());
                }
                break;                
            case 8:
                System.out.println("Button c8");
                if(statesImplementation.scenario() ==3 ){
                    statesImplementation.setCurrentState(statesImplementation.getFuelState());
                }else{
                    statesImplementation.setCurrentState(statesImplementation.getThankYouState());
                }

                //statesImplementation.setCurrentState(statesImplementation.getThankYouState());
                break;                
                     
            default:
                System.out.println("Default");
                break;                
        }
    }
}
