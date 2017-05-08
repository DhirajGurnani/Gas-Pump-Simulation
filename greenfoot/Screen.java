import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Screen extends Actor
{
  //  private Message message = new Message();
	static String text="";
	private static SystemState systemstate;
	private FuelType fuelType;
	private String type;
	private Pumping pumping;
	private long pumpTime;
    private boolean mouseDown = false; 
    
    public Screen(){
         GreenfootImage image = getImage() ;
        image.scale( 600, 470 ) ;
    }

    /*public Screen(String message){
        this.message = new Message(message);

    }*/
    
    public void act(){
        fuelType = new FuelType(this);
        
    
        if(systemstate == SystemState.FUELTYPE){
            fuelType.chooseFuelType();
        }
        
       if(systemstate == SystemState.SHOWFUEL)
        {
            fuelType.showFuelType();
        }
        if (systemstate == SystemState.PUMPGAS) {
            pumping.PumpGas();
        }
        
    }
    
    public void welcomeMessage() {
        String str = "Welcome" + "\n" +"Please insert card";
        setMessage(str);       
    }
    
    public void setMessage () 
    {
      /* message.setText(text);
       getWorld().addObject(message,400,150);// Adjust coordinates */
    }
    
    public void setMessage (String str) 
    {
       /*message.setText(str);
       getWorld().addObject(message,400,150);*/// Adjust coordinates 
    }
    
    public void showText(String txt){
        text = txt;
    }
    
    public void setFuelType(String str)
    {
        type = str;
    }
    public String getFuelType()
    {
        return type;
    }
    
    public static void setState( SystemState entry) {
        systemstate = entry;
    }
    public SystemState getState()
    {
        return systemstate;
    }
    
     public long getPumpedTime(){
        return pumpTime;
    }
    public void setPumpingTime(long time){
        this.pumpTime = time;
    }
    
    public void run()
    {
        showText("Welcome to the Scorpions Gas Station");
        setMessage();
        nextState();
    }
    public void nextState()
    {
        setState(systemstate);
    }

    
  /*  
	public void displayReceipt()
    {
		String receipt = "You pumped for " + nozzle.getTime()+ " secs."; 
		receipt += "\n The total cost is $" + price.calculatePrice(nozzle.getTime(),Integer.parseInt(octane),wash);
		receipt += "\n print receipt?";
		setMessage(receipt);
    }*/

}