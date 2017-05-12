import java.text.DecimalFormat;

/**
 * Write a description of class CustomOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomOrder  
{
   public PriceDecorator decorator = null;

    public CustomOrder(String d){
        System.out.println("CustomOrder created");
    }

    public void setDecorator(PriceDecorator p) {
        this.decorator = p;
    }

    public Double getPrice() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Print desc price " + fmt.format(decorator.getPrice()));
        return decorator.getPrice();
    }

}
