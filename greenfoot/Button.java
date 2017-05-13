import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Button here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Button extends StatesImplementation
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int id;
    Message msg;
    
    public Button(){
        GreenfootImage image = getImage() ;
        image.scale( 40, 40 ) ;
        
    }
    
    public Button(int id) {
        GreenfootImage image = getImage() ;
        image.scale( 40, 40 ) ;
        this.id = id;
    }
    
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            
            if(currentState instanceof WelcomeState){
                Greenfoot.playSound("beep.wav");
            }
            
            currentState.onButtonClick(id);
            msg = (Message) getWorld().getObjects(Message.class).get(0);
            System.out.println(currentState.getMessage());
            msg.setText(currentState.getMessage());
            msg.setStateButtonText(currentState);
            /*if(currentState instanceof BillState){
                totalprice = Buildorder.getOrder(isWash_service(),isAir_service(),
       isMaintenance_service(), getFueltype_selected(), 
       getGallon_filled());
       System.out.println(totalprice);
            }*/
            // getWorld().addObject(msg, 300 , 40);
            // currentState.setState();
        }
    }
}
