import greenfoot.*;

public class GasType extends Actor
{
   
    private Screen screen;
    
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
    public String chooseGasType(int x, int y) {
        
        return "";
    
       
    }
}
