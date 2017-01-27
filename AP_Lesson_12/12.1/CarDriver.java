import java.util.Scanner;
public class CarDriver
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter paint color: ");
        String paint = kb.next();
        System.out.println("Please enter interior preference: ");
        String interior = kb.next();
        System.out.println("Please enter engine: ");
        String engine = kb.next();
        System.out.println("Please enter tire preference: ");
        String tires = kb.next();
        
        Car_Class object = new Car_Class(paint, interior, engine, tires);
        System.out.println("Your vehicle is ready...... " +
                           " Paint: " + object.getPaint() +
                           " Interior: " + object.getInterior() +
                           " Engine: " + object.getEngine() +
                           " Tires: " + object.getTires());
        
        object.setCustom(paint, interior, engine, tires);
        System.out.println("Please enter paint color: ");
        paint = kb.next();
        System.out.println("Please enter interior preference: ");
        interior = kb.next();
        System.out.println("Please enter engine: ");
        engine = kb.next();
        System.out.println("Please enter tire preference: ");
        tires = kb.next();
        
        System.out.println("Your vehicle is ready...... " +
                           " Paint: " + object.getPaint() +
                           " Interior: " + object.getInterior() +
                           " Engine: " + object.getEngine() +
                           " Tires: " + object.getTires());
        
        
    }
}