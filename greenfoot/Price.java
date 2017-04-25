import java.util.*;
public class Price  
{
    public static final double pump = 10;// estimated gallons per min
    static final double discount = 0.75;//randomly set discount for car wash
    private Map<Integer, Double> fuelTypeMap = fuelTypeMap = new HashMap<>();

    /**
     * Constructor of the class
     */
    public Price(){
        
        fuelTypeMap.put(87, 2.60);
        fuelTypeMap.put(89, 2.87);
        fuelTypeMap.put(91, 3.05);
    }

    
    public double calculatePrice(double time, int fuelType, boolean wash) {
        double temp = (time / 60) * pump * fuelTypeMap.get(fuelType);
        if(wash == true){
            return temp * discount;
        }else{
            return temp;
        }
    }
}