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
        message = new Message();      

        addObject ( sts , 400, 270);                
        addObject( new Button(1), 68, 100 ) ;
        addObject( new Button(2), 68, 200 ) ;
        addObject( new Button(3), 68, 300 ) ;
        addObject( new Button(4), 68, 400 ) ;
        addObject( new Button(5), 735, 100 ) ;
        addObject( new Button(6), 735, 200 ) ;
        addObject( new Button(7), 735, 300 ) ;
        addObject( new Button(8), 735, 400 ) ;    
        //addObject( new Screen(), 400 , 270 ) ; 

        addObject( message,350 , 250 ) ;
        
        addObject( new GasType(),400 , 670 ) ;
        addObject( new Nozzle(), 1000 , 670 ) ;
        addObject( new CardReader(),100 , 670 ) ;
        addObject( new CreditCard(),50 , 670 ) ;
        
        KeyPad keyPad = new KeyPad();
      addObject( keyPad, 992, 200 );
      for(int i=0; i<12; i++){
          Key key = new Key(i);
          key.attachKeyPad(keyPad);
          if(i < 3){
              addObject( key, 950+(i*40), 140);
          }else if(i > 2 && i < 6){
              addObject( key, 950+((i%3)*40), 180);
          }else if(i > 5 && i < 9){
              addObject( key, 950+((i%6)*40), 220);
          }else if(i > 8){
              addObject( key, 950+((i%9)*40), 260);
          }

      }
      sts.init();
      sts.setKeyPad(keyPad);
    }

    
    
}
