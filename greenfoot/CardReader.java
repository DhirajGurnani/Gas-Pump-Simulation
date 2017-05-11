import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardReader extends StatesImplementation
{
     Message msg;
    private boolean hasCreditCard;
    
    /**
     * Act - do whatever the CardReader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   // Message msg = new Message();
    public CardReader(){
         GreenfootImage image = getImage() ;
        image.scale( 40, 40 ) ;
        hasCreditCard = false;
    }
    
    public void act() 
    {
        // Add your action code here.
        Actor creditCard = getOneIntersectingObject(CreditCard.class);
        if(creditCard != null && !hasCreditCard)
        {
            currentState.setState();
            hasCreditCard = true;
        }
    }    
}
