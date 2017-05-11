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
    private Thread timer;
    private int countPress = 0;
    private double gallons = 0;
    
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
            //System.out.println("inside act");
            running =!running;
            countPress++;
            counter();
        }
    }
    
    public void counter(){
        msg = (Message) getWorld().getObjects(Message.class).get(0);
        timer = new Thread(){
            public void run(){
                for(double i=0; i<17.0; i=i+0.5){
                    if(!running){
                        if(countPress == 2){
                            pumping_done = true;
                        }
                        gallon_filled = i;
                        break;
                    }                    
                    setMessage("Pumping fuel "+ i + " gallons");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.err.println("Thread can't sleep "+ e.getMessage());
                    }
                }
                setMessage("Pumping done! "+ gallon_filled + " gallons" );
                msg.setStateButtonText(currentState);
                //System.out.println("under this expected");
                    //image.drawString("Retry >>", 460, 350);
            }
        }   ;
        timer.start();
        //System.out.println("it says ");
        
    }
    
    private void setMessage(String str){
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