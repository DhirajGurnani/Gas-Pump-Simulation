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
            System.out.println("aaya");
            fueltype = chooseGasType(mouse.getX(),mouse.getY());
        }
        return fueltype;
    }
    
    public void act(){
        if(this.currentState instanceof fuelState){
        
        if (Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            
            fuel_selected = chooseGasType(mouse.getX(),mouse.getY());
            msg = (Message) getWorld().getObjects(Message.class).get(0);
            setMessage(fuel_selected + " selected" + "\n" + "Proceed Pumping");
            //setMessage();
            currentState.setState();
            System.out.println("aaya");
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
