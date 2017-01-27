import java.util.Scanner;
public class Distance_Runner
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter first x-value: ");
        int xOne = kb.nextInt();
        System.out.println("Please enter first y-value: ");
        int yOne = kb.nextInt();
        System.out.println("Please enter second x-value: ");
        int xTwo = kb.nextInt();
        System.out.println("Please enter second y-value: ");
        int yTwo = kb.nextInt();
        
    Distance object = new Distance(xOne, yOne, xTwo, yTwo);
        System.out.println("Distance = " + object.getDistance());
        
        object.setValues(xOne, yOne, xTwo, yTwo);
        System.out.println("Please enter first x-value: ");
        xOne = kb.nextInt();
        System.out.println("Please enter first y-value: ");
        yOne = kb.nextInt();
        System.out.println("Please enter second x-value: ");
        xTwo = kb.nextInt();
        System.out.println("Please enter second y-value: ");
        yTwo = kb.nextInt();
        
        System.out.println("Distance = " + object.getDistance());
        
        
    }
}