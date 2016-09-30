import java.util.Scanner;

public class Ex_03
{
	static double side;
	static double sa;
	
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the lenght of the side of your cube? ");
		side = kb.nextDouble();
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = 6*Math.pow(side, 2);
	}
	
	public static void print()
	{
		System.out.println("The surface area of a cube whose sides are " + side + " in length is " + sa);
	}
}