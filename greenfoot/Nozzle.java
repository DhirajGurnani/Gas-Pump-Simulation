import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nozzle extends StatesImplementation
{
    
    long timePressed; //in seconds    
    long nozzleStart;
    long nozzleStop;
    boolean nozzlePressed;
    boolean nozzleActive;
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
                            pumpingDone = true;
                        }
                        gallonsFilled = i;
                        break;
                    }                    
                    setMessage("Pumping fuel "+ i + " gallons");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.err.println("Thread can't sleep "+ e.getMessage());
                    }
                }
                setMessage("Pumping done! "+ gallonsFilled + " gallons" );
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
}