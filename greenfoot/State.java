/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface State  
{
  // public void screenSetup();
   public void btnSetUp();
   public void setMessage(String msg);
   public void setGasNumber();
   public void setKepPad();
   public void setCreditCard();
   public void setUpNozzle();
   
      public void setCurrentState(State updatedState);
      public State getValidateCardState();
  
}
