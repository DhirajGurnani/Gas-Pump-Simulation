import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GasPump extends World
{

    public GasPump()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1);
        
        addObject( new Button(), 68, 100 ) ;
        addObject( new Button(), 68, 200 ) ;
        addObject( new Button(), 68, 300 ) ;
        addObject( new Button(), 68, 400 ) ;
        addObject( new Button(), 735, 100 ) ;
        addObject( new Button(), 735, 200 ) ;
        addObject( new Button(), 735, 300 ) ;
        addObject( new Button(), 735, 400 ) ;

        
        addObject( new Screen(), 400 , 250 ) ;
        addObject( new GasType(),400 , 670 ) ;
        addObject( new Nozzle(), 1000 , 170 ) ;
       
    }
}
