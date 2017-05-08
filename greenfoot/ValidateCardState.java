import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ValidateCardState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ValidateCardState extends StatesImplementation
{
    /**
     * Act - do whatever the ValidateCardState wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    StatesImplementation statesImplementation;
    
    
    
    public ValidateCardState(StatesImplementation statesImplementation){
      this.statesImplementation = statesImplementation;
      
    }
    
    public void setMessage(String msg){
        GasPump gb = (GasPump)getWorld();
        
            Message ins = gb.getMessage();
            ins.setText(msg);
    }
}
