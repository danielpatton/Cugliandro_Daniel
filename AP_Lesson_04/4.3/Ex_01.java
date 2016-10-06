import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your length: ");
		double l = kb.nextDouble();
		System.out.println("Please enter your width: ");
		double w = kb.nextDouble();
		print (calcPerim(l, w));
		
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %10.5f", perimeter, " ft around.");
	}
}