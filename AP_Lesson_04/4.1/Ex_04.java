import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Ex_04 subwoofer= new Ex_04();
		
		System.out.println("What is the height of your subwoofer? ");
		double h = kb.nextDouble();
		System.out.println("What is the length of your subwoofer? ");
		double l = kb.nextDouble();
		System.out.println("What is the width of your subwoofer? ");
		double w = kb.nextDouble();
		double CalcVol = subwoofer.total(h, l, w);
		System.out.printf("The volume of your subwoofer is \n%15.2f", CalcVol);
		
	}
	
	public double total(double height, double length, double width)
	{
		return (height*length*width)/1728;
	}
}