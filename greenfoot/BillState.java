/**
 * Write a description of class BillState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
public class BillState  implements State 
{
    // instance variables - replace the example below with your own

    StatesImplementation statesImplementation;
    Double totalprice = 0.0;
    
    public BillState(StatesImplementation statesImplementation){
        
        this.statesImplementation = statesImplementation;
       /*  totalprice = Buildorder.getOrder(statesImplementation.isWash_service(),statesImplementation.isAir_service(),
       statesImplementation.isMaintenance_service(), statesImplementation.getFueltype_selected(), 
       statesImplementation.getGallon_filled());*/
    }
   
    
   public String getMessage(){
       //System.out.println("get message check");
       Double totalPrice = GasPumpOrder.getOrder(statesImplementation.getServices(), statesImplementation.getFueltypeSelected(), 
       statesImplementation.getGallonsFilled());
       //statesImplementation.totalprice = round(statesImplementation.totalprice,2);
       //temp = statesImplementation.totalprice;
       DecimalFormat fmt = new DecimalFormat("0.00");
       statesImplementation.setTotalPrice(Double.valueOf(fmt.format(totalPrice)));
       return "Total Amount: " + statesImplementation.getTotalPrice();
   }
    
   public void setState(){
       statesImplementation.setCurrentState(statesImplementation.getValidateCardState());
   }
   
   public State getCurrentState(){
       return statesImplementation.getCurrentState();
   }
        
   public void onButtonClick(int buttonId){
       System.out.println("Button click welcomestate "+ buttonId);
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
                //statesImplementation.getServices().add("Wash");
                break;
            case 4:
                System.out.println("Button 4");
                //statesImplementation.getServices().add("Maintainence");
                break;
            case 5:
                System.out.println("Button 5");
                break;
            case 6:
                System.out.println("Button 6");
                break;                
            case 7:
                System.out.println("Button 7");
                //statesImplementation.getServices().add("Air");
                break;                
            case 8:
                System.out.println("Button 8");

                if(statesImplementation.scenario() == 3){
                //statesImplementation.setCurrentState(statesImplementation.getThankYouState());
                   if(statesImplementation.getServices().isEmpty()){
                       if(statesImplementation.printCheck){
                           statesImplementation.showReceipt();
                        }
                statesImplementation.setCurrentState(statesImplementation.getThankYouState());
            } else {
                statesImplementation.showReceipt();
                statesImplementation.setCurrentState(statesImplementation.getThankYouState());
            }
            }else{
                       System.out.println("Services: " + statesImplementation.getServices());
                if(statesImplementation.getServices().isEmpty()){
                statesImplementation.setCurrentState(statesImplementation.getAskingPrintReceiptState());
            } else {
                statesImplementation.showReceipt();
                statesImplementation.setCurrentState(statesImplementation.getThankYouState());
            }
        }
               //statesImplementation
               break;                

            default:
                System.out.println("Default");
                break;                
        }
   }
}