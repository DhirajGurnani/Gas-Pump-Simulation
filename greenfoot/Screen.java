import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    /**
     * Act - do whatever the screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Message message = new Message();
	private Nozzle nozzle;
	private Price price; 
	private FuelType fuelType;
    private String octane;
    private boolean mouseDown = false;
    private boolean wash;    
    
    public void welcomeMessage() {
        String str = "Welcome" + "\n" +"Please insert card";
        setMessage(str);       
    }
    
    public void setMessage (String str) 
    {
       message.setText(str);
       getWorld().addObject(message,100,100);// Adjust coordinates 
    }
    
    public void showFuelType(){
        
        fuelType = getWorld().getObjects(FuelType.class).get(0);    
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
         if(Greenfoot.mousePressed(fuelType))
        {
			octane = fuelType.chooseFuelType(mouse.getX(),mouse.getY());
			String display = "You have selected #" + fuelType +"\n Please lift the nozzle to pump";
			setMessage(display);
			mouseDown = false;
        }
    }
    
    public void pumpGas(){
		nozzle = getWorld().getObjects(Nozzle.class).get(0);
		if(Greenfoot.mousePressed(nozzle) && !nozzle.isStarted()){
			nozzle.startNozzle();
		} else if(Greenfoot.mousePressed(nozzle) && nozzle.isStarted()){
			
			nozzle.stopNozzle();
			showReceipt();
		}
	}
	public void displayReceipt()
    {
		String receipt = "You pumped for " + nozzle.getTime()+ " secs."; 
		receipt += "\n The total cost is $" + price.calculatePrice(nozzle.getTime(),Integer.parseInt(octane),wash);
		receipt += "\n print receipt?";
		setMessage(receipt);
    }

}