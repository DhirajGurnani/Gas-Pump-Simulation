import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardReader extends Actor
{
    /**
     * Act - do whatever the CardReader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   // Message msg = new Message();
    public CardReader(){
         GreenfootImage image = getImage() ;
        image.scale( 40, 40 ) ;
    }
    
    public void act() 
    {
        // Add your action code here.
        Actor creditCard = getOneObjectAtOffset(+10, +10, CreditCard.class);
        if(creditCard != null)
        {
          // msg.setText("tmkc");
              
        }
    }    
}
