import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpMachine extends Actor
{
    /**
     * Act - do whatever the GasPumpMachine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    State welcomeState;
    State enterZipCode;
    State selectFuel;
    State startNozzle;
    State selectServices;
    State receipt;
    
    State state = welcomeState;
    Screen screen;
    Message msg;
    
    public GasPumpMachine(){
        this.screen = new Screen("Welcome");
        this.welcomeState = new WelcomeState(this);
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
