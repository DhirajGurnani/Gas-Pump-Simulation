import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nozzle extends Actor
{
    
    long timePressed; //in seconds    
    long nozzleStart;
    long nozzleStop;
    boolean nozzlePressed;
    boolean nozzleActive;
    
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