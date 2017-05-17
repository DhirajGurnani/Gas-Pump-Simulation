import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fuel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuel extends LeafDecorator
{    
    private String option;
    private Double quantity;

    public Fuel(String d) {
        super(d);
        
    }
    
    public void setQuantity(Double a){
        this.quantity = a;
    }

    public void setOption(String option) {
        this.option = option;
        if(this.option.equalsIgnoreCase("87")){
            this.price += quantity  * 2.929;    
            
        } else if(this.option.equalsIgnoreCase("89")){
            this.price += quantity  * 3.129 ;
            
        } else if(this.option.equalsIgnoreCase("93")){
            this.price += quantity  * 3.329;    
            
        }

    }

    public String getDescription() {
        String desc = this.option;
        return desc;
    }
}