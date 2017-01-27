import java.util.Scanner;
public class MilesPerHour_Runner
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter distance: ");
        int distance = kb.nextInt();
        System.out.println("Please enter hours: ");
        int hours = kb.nextInt();
        System.out.println("Please enter minutes: ");
        int minutes = kb.nextInt();
        
        MilesPerHour object = new MilesPerHour(distance, hours, minutes);
        System.out.println(object.Distance() + " miles in " + object.Hours() + " hours and " + object.Minutes() + " minutes  = " + object.getMPH() + " mph ");
        
        object.setValues(distance, hours, minutes);
        System.out.println("Please enter distance: ");
        distance = kb.nextInt();
        System.out.println("Please enter hours: ");
        hours = kb.nextInt();
        System.out.println("Please enter minutes: ");
        minutes = kb.nextInt();
        
        System.out.println(object.Distance() + " miles in " + object.Hours() + " hours and " + object.Minutes() + " minutes  = " + object.getMPH() + " mph ");
        
        
    }
}