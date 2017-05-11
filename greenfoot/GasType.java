import greenfoot.*;

public class GasType extends StatesImplementation
{
   
    private Screen screen;
    String fuel_selected;
    private Message msg;
    
   public GasType() {
        GreenfootImage image = getImage();
        image.scale(500, 250);//adjust coordinates
    }
   
    public String getGasType(){
        
        String fueltype = "";
        if (Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            fueltype = chooseGasType(mouse.getX(),mouse.getY());
        }
        return fueltype;
    }
    
    public void act(){
        if(this.currentState instanceof FuelState){
        
        if (Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            currentState.setState();            
            fuel_selected = chooseGasType(mouse.getX(),mouse.getY());
            fueltype_selected = fuel_selected;
            msg = (Message) getWorld().getObjects(Message.class).get(0);
            setMessage("Fuel type " + fuel_selected + " selected" + "\n\t" + "Proceed Pumping");
        }
    }
    }
    
    public String chooseGasType(int x, int y) {
        System.out.println(x + " : " + y);
        if((x>210 && x<326) && (y>680 && y < 783)){
            return "87";
        } else if((x>339 && x<453) && (y>680 || y < 783)){
            return "89";
        } else if((x>462 && x<578) && (y>680 || y < 783)){
            return "93";
        } else {
            return "";
        }

       
    }
    
    private void setMessage(String str){
        //if(currentState instanceof ValidateCardState){
            System.out.println("Setting message "+str);
            msg.setText(str);
        
    }
}
