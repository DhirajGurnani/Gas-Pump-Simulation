/**
 * Write a description of class WelcomeState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeState implements State 
{
    // instance variables - replace the example below with your own

    StatesImplementation statesImplementation;
    
    public WelcomeState(StatesImplementation statesImplementation){
        this.statesImplementation = statesImplementation;
    }
   
    
       public String getMessage(){
           return "Welcome!";
        }
        
        public void setState(){
           statesImplementation.setCurrentState(statesImplementation.getValidateCardState());
        }

}
