import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Others here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Others extends LeafDecorator
{
    private String option;
    private Double quantity;
    
    /**
     * Act - do whatever the Others wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ private String[] options;

    public Others(String d) {
        super(d);
    }

    // 1 sauce free, extra +.75
    public void setOption(String option) {
        this.option = option;

        if(this.option.equalsIgnoreCase("Wash")){
            this.price += 15.00;
        } else if(this.option.equalsIgnoreCase("Air")){
            this.price += 0.00;
        } else if(this.option.equalsIgnoreCase("Maintainence")){
            this.price += 50.00;
        } 
    }

    public String getDescription() {
        String desc = this.option;
        return desc;
    }
    
    public void setQuantity(Double a){
        
    }
}
