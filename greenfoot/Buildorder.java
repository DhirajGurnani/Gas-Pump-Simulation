import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buildorder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buildorder extends Actor
{

	public static LeafDecorator getOrder() {
		LeafDecorator order = new LeafDecorator("order");
		// base price for 1/3 lb
				fuel b = new fuel("Suresj ka fuel");
				b.setQuantity(5.00);
				String[] bo = { "87" };
				b.setOptions(bo);
				// 1 cheese free, extra cheese +1.00
				Others c = new Others("Additional functionalaties");
				String[] co = { "Wash", "air" };
				c.setOptions(co);
				c.wrapDecorator(b);
				order.wrapDecorator(c);
				
				
				return order;
	}
}
