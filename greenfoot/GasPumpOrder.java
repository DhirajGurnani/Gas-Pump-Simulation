import java.util.*;
/**
 * Write a description of class GasPumpOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpOrder  
{
    public static Double getOrder(HashSet<String> services, String fuelType, double fuelQuantity) {
        CustomOrder order = new CustomOrder("order");
        Fuel b = new Fuel("Fuel Type");
        b.setQuantity(fuelQuantity);
        b.setOption(fuelType);
        
        Others c = new Others("Additional Services");
        for(String service : services){
            c.setOption(service);
        }
                                
        c.wrapDecorator(b);
        order.setDecorator(c);
                
        return order.getPrice();
    
    }
}
