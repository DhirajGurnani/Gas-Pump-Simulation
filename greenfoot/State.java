/**
 * Write a description of class State here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface State
    {
        // public void screenSetup();
        // public void btnSetUp();
        public String getMessage();
        /*public void setGasNumber();
         public void setKepPad();
         public void setCreditCard();
         public void setUpNozzle();*/
        public void onButtonClick(int buttonId);
        public void setState();
        //   public State getValidateCardState();
        
    }
