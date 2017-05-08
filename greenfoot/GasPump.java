import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPump extends World
{
    private Message message;
    private StatesImplementation sts;
    
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GasPump()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(1300, 900, 1);
     sts = new StatesImplementation();
      addObject ( sts , 300, 400);
      addObject( new Button(), 68, 100 ) ;
      addObject( new Button(), 68, 200 ) ;
      addObject( new Button(), 68, 300 ) ;
      addObject( new Button(), 68, 400 ) ;
      addObject( new Button(), 735, 100 ) ;
      addObject( new Button(), 735, 200 ) ;
      addObject( new Button(), 735, 300 ) ;
      addObject( new Button(), 735, 400 ) ;
     
      addObject( new Screen(), 400 , 270 ) ;
      
       message = new Message();
      

      addObject( message,300 , 400 ) ;
     
       
      addObject( new GasType(),400 , 670 ) ;
      addObject( new Nozzle(), 1000 , 170 ) ;
      
      addObject( new CardReader(),100 , 670 ) ;
     
       addObject( new CreditCard(),50 , 670 ) ;
     //addObject( new GasPumpMachine(), 400 , 270 ) ;

     
    }
       
    
}
