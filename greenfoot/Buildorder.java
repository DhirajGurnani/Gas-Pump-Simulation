import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buildorder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buildorder extends Actor
{

    public static Double getOrder(boolean wash, boolean air, boolean maintenance, String fuelType, double fuelQuantity) {
        LeafDecorator order = new LeafDecorator("order");
        // base price for 1/3 lb
                Fuel b = new Fuel("Fuel Type");
                b.setQuantity(fuelQuantity);
                String bo = fuelType ;
                b.setOptions(bo);
                // 1 cheese free, extra cheese +1.00
                Others c = new Others("Additional functionalaties");
                String[] co = new String[5];//= { "Wash", "air" };
                
                int length = 0;
                for(int i=0; i<4; i++){
                    if(wash == true || air == true || maintenance == true){
                        if( wash == true){
				        co[i] = "Wash";
				        length++;
				        continue;
				       }
				       if( air == true){
				        co[i] = "Air";
				        length++;
				        continue;
				       }
				       if( maintenance == true){
				        co[i] = "Maintenance";
				        length++;
				        continue;
				       }
                    }else{
                        break;
                    }
                    
                }
                
                String[] coo = new String[length];
                for(int i=0; i<length; i++){
                    coo[i] = co[i];
                }
                
                c.setOptions(coo);
                c.wrapDecorator(b);
                order.wrapDecorator(c);
                
                    
                return order.getPrice();
    
            }
        }
