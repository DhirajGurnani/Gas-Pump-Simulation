import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nozzle extends Actor
{
    
    long timePressed; //in seconds    
    long nozzleStart;
    long nozzleStop;
    boolean nozzlePressed;
    boolean nozzleActive;
    private Screen screen;
    
     public void act() 
    {    
    }

    public Nozzle()
    {
       int mouseX, mouseY;
       nozzlePressed = false;
       nozzleActive = false;
    }
    
    
    public void startNozzle()
    {
		nozzlePressed = true;
		screen = getWorld().getObjects(Screen.class).get(0);
		screen.setMessage("Pumping fuel. \n Click the nozzle to stop.");
        this.nozzleStart =  System.nanoTime();//Gives time in nano secs
    }
    public void stopNozzle()
    {
        this.nozzleStop =  System.nanoTime();
    }
	public void pumpActive()
	{
		this.nozzleActive = true;
	}
	public boolean isStarted()
	{
		return nozzlePressed;
	}
	public long getTime()
	{
	    timePressed = (nozzleStop-nozzleStart)/1000000000;
	    return timePressed;
	}
	

}