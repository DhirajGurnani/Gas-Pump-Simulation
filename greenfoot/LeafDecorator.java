import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeafDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class LeafDecorator implements PriceDecorator
{
    /**
     * Act - do whatever the LeafDecorator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    PriceDecorator wrapped;
	Double price = 0.00;
	String Description;

	public LeafDecorator(Double d) {
		this.price = d ;
		this.wrapped = null;
	}
	
	public LeafDecorator(String d) {
		this.Description = d ;
		this.wrapped = null;
	}

	public void wrapDecorator(PriceDecorator w) {
		this.wrapped = w;
	}

	public Double getPrice() {
		if (wrapped == null) {
			return price;
		} else {
			return price + wrapped.getPrice();
		}
	}

	public abstract void setOption(String option);
	
	public abstract void setQuantity(Double a);

	public abstract String getDescription();

	//@Override
	public void printDescription() {
		System.out.println(getDescription());
	}
}
