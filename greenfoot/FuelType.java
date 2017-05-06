import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class FuelType extends Actor
{
    private GasType gastype;
    private Screen screen;
    private SystemState state;
    private boolean mouseDown = false;
    private String fuelType;
    public FuelType(Screen screen)
    {
        this.screen = screen;
        //gastype = screen.getWorld().getObjects(GasType.class).get(0);
        //Change n uncomment the above statement after setting the keypad

    }
  public void chooseFuelType()
    {
        screen.setMessage("Please select fuel type!");
        state = SystemState.FUELTYPE;

       gastype = screen.getWorld().getObjects(GasType.class).get(0);
       MouseInfo mouse = Greenfoot.getMouseInfo();
       
       if( state == SystemState.FUELTYPE && mouseDown == false && Greenfoot.mousePressed(gastype) )
       {
           state = SystemState.SHOWFUEL;
           
           mouseDown = true;
        }
        screen.setState(state); 
   }
     public void showFuelType()
    {
        if(state == SystemState.FUELTYPE ){
            state = SystemState.SHOWFUEL;
        } else {
            state = SystemState.PUMPGAS;
        }
        screen.setState(state);
        gastype = screen.getWorld().getObjects(GasType.class).get(0);    
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(Greenfoot.mousePressed(gastype))
        {
            fuelType = gastype.chooseGasType(mouse.getX(),mouse.getY());
            screen.setFuelType(fuelType);
            String showType = (" You have chosen #" + fuelType +"\n Please lift the nozzle and start pumping.");
            screen.setMessage(showType);
            mouseDown = false;
            Greenfoot.delay(20);
        }
    }
}
