import java.util.Scanner;

public class Ex_04
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius: ");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = 3.14*Math.pow(r, 2);
	}
	
	public static void print()
	{
		System.out.println("The area of your circle with a radius of " + r + " is " + area);
	}
	
}