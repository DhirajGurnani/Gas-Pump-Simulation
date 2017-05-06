import greenfoot.*;

public class Pumping extends Actor
{
    private Nozzle nozzle;
    private Screen screen;
    private SystemState systemstate;
    
    public Pumping(Screen screen)
    {
        this.screen = screen;
    }
    
     public void PumpGas(){
        nozzle = screen.getWorld().getObjects(Nozzle.class).get(0);
        if(Greenfoot.mousePressed(nozzle) && !nozzle.isStarted()){
            
            System.out.println("Pump it");
            nozzle.startNozzle();
        } else if(Greenfoot.mousePressed(nozzle) && nozzle.isStarted()){
      
            System.out.println("Pumping stopped. XXXX time & cost.");
            nozzle.stopNozzle();
            // SystemState--> Show receipt;
            screen.setState(systemstate);
            screen.setPumpingTime(nozzle.getTime());
        }
    }
    
}
