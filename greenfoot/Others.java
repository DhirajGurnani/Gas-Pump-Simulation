import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Others here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Others extends LeafDecorator
{
    /**
     * Act - do whatever the Others wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */	private String[] options;

	public Others(String d) {
		super(d);
	}

	// 1 sauce free, extra +.75
	public void setOptions(String[] options) {
		this.options = options;
		for(int i =0 ;i<this.options.length;i++){
			if(this.options[i].equalsIgnoreCase("Wash")){
				this.price += 15.00;
			} else if(this.options[i].equalsIgnoreCase("Air")){
				this.price += 0.00;
			} else if(this.options[i].equalsIgnoreCase("Services")){
				this.price += 50.00;
			} 
		}

	}

	public String getDescription() {
		String desc = "";
		for (int i = 0; i < options.length; i++) {
			if (i > 0)
				desc += " + " + options[i];
			else
				desc = options[i];
		}
		return desc;
	}
}
