import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nozzle extends StatesImplementation
{
    
    long timePressed; //in seconds    
    long nozzleStart;
    long nozzleStop;
    boolean nozzlePressed;
    boolean nozzleActive;
    private Screen screen;
    private Message msg;
    boolean running = false;
     

    public Nozzle()
    {
       int mouseX, mouseY;
       nozzlePressed = false;
       nozzleActive = false;
       GreenfootImage image = getImage() ;
        image.scale( 140, 140 ) ;
    }
    
    public void act(){
        if (Greenfoot.mouseClicked(this)){
            System.out.println("inside act");
        running =!running;
        counter();
    }
    }
    
    public void counter(){
        for(int i = 0;i<17;i++){
            if(running){
                msg = (Message) getWorld().getObjects(Message.class).get(0);
            setMessage(String.valueOf(i));
            long lastAdded = System.currentTimeMillis();
            long currentA = System.currentTimeMillis();
            while(currentA < lastAdded + 1000){
              currentA = System.currentTimeMillis();
            }
        } else {
            break;
        }
        }
    }
    
    private void setMessage(String str){
        //if(currentState instanceof ValidateCardState){
            System.out.println("Setting message "+str);
            msg.setText(str);
        
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