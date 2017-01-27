import java.util.Scanner;
public class InventoryDriver
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter item name: ");
        String Name = kb.next();
        System.out.println("Please enter item manufacturer: ");
        String Manufacturer = kb.next();
        System.out.println("Will you be entering category and price information? (y or n) ");
        String desicion = kb.next();
       
        if(desicion == "n")
        {
            Inventory object = new Inventory(Manufacturer, Name);
            System.out.println(object);
        }
        else if(desicion == "y")
        {
            System.out.println("Please enter item category: ");
            String Category = kb.next();
            System.out.println("Please enter item price: ");
            double Price = kb.nextInt();
            Inventory object = new Inventory(Manufacturer, Name, Category, Price);
            System.out.println(object);
            
        }
        
        
        
        
        
    }
}