import java.util.Scanner;
public ToyRunner
{
	public static void main(String[]args)
    {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your action figure: ");
		String AF = kb.next();
		System.out.println("Please enter your car: ");
		String car = kb.next();
		
		AFigure object = new AFigure(name, count);
		Car object = new Car(name, count);
        System.out.print(object.toString());
	}
}