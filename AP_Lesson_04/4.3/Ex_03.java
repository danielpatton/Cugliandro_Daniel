import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of the side of your cube? ");
		double side = kb.nextDouble();
		print(calcSurf(side), side);
		
	}
	
	public static double calcSurf(double side)
	{
		return 6*Math.pow(side, 2);
	}
	
	public static void print(double sa, double side)
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %15.5f", sa);
	}
}