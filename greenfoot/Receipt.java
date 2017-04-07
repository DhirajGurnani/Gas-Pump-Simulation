import greenfoot.*;  

/**
 * Basic Receipt func.
 *
 */

public class Receipt extends State 
{
    final String DISPLAY_MSG = "Do you want to print a receipt?";
    final String YES = "Yes";
    final String NO = "No";
	int cost = 0;

    /**
     * Constructor 
     */
    public Receipt() 
    {
    }
	public Receipt(int cost) 
	{
		this.cost = cost;
		cost+=cost;
	}

	public void display() 
	{
		System.out.println("Your total bill is " + cost);
		Greenfoot.delay(10);
		System.out.println("Thank you! Have a nice day.");
	}
    
    
}

