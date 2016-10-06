import java.util.Scanner;

public class Ex_04
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius: ");
		double r = kb.nextDouble();
		print(calcArea(r), r);
	}
	
	public static double calcArea(double r)
	{
		return 3.14*Math.pow(r, 2);
	}
	
	public static void print(double area, double r)
	{
		System.out.println("The area of your circle with a radius of " + r + " is " + area);
	}
	
}