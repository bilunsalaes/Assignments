//Michael Martin
//IT210
import java.util.Scanner;
public class CraftPricing
{
    public static void main(String[] args)
    {
        //These are my input values
        double materials;
        double hours;
        double shipping;
        double discount;
        Double RetailPrice;
        String ProductName;
        
        //This will give me a new product name with each inquiry.
        //CraftyCreations ProductName = new CraftyCreations();
        //Keyboard
        
        Scanner keyboard = new Scanner(System.in);
        
        //The following are inputs for calculations
        System.out.print("Enter material cost >> ");
        materials = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter hours worked >> ");
        hours = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter additional shipping cost beyond $6 >> ");
        shipping = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter the name of the product you are interested in  >> ");
        ProductName = keyboard.nextLine();
        
        //The following are for calculations.  I allowed shipping to allow for increased values in case of overnight options.
        RetailPrice = .75 * (materials + (14 * hours)) + shipping;
        shipping = 6 + shipping;
        System.out.printf("The total cost of the "+ProductName+" that you are interested in, with discount, is : %.2f", +RetailPrice);
        }
       
    //This will call the CraftyCreations class    
    public static CraftyCreations getData(CraftyCreations s)
    {
        //These are specifically what will be called if and when needed.
        double materials;
        double hours;
        double shipping;
        String ProductName;
        return s;
        
        }
}
