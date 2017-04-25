import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class FuelType extends Actor
{
    private Screen screen;
    
    public FuelType() {
        GreenfootImage image = getImage();
        image.scale(100, 100);//Adjust coordinates
    }
    public void act() 
    {
        
        if (Greenfoot.mousePressed(this))
        {
          screen = getWorld().getObjects(Screen.class).get(0);
          screen.showFuelType();
        }
       
    }
    public String getFuelType(){
        
        String fuelType = " ";
        if (Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            fuelType = chooseFuelType(mouse.getX(),mouse.getY());
        }
        
        return fuelType;
    }
    public String chooseFuelType(int x, int y) {
        if (getX() == 0 )//set proper conditions
       {
           return "87";
       }
       else if(getX() == 1)//set condition
       {
           return "89";
        }
         else if(getX() == 2)//set condition
       {
           return "91";
       }
       return " ";
    }
       
}