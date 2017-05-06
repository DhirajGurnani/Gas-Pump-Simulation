import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    
 Message message;
    
    public Screen(){
         GreenfootImage image = getImage() ;
        image.scale( 600, 470 ) ;
      //  this.message = new Message("Welcome");
    }
    
    public Screen(String message){
       // this.message = new Message(message);
    }
}