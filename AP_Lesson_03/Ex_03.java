import java.util.Scanner; //import Statement

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of your phone? ");
		double l = kb.nextDouble();
		System.out.println("What is the width of your phone? ");
		double w = kb.nextDouble();
		double t =(l*w);
		System.out.println("The area of your phone is " + t );
	}
}	