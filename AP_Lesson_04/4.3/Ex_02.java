import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first value: ");
		double num1 = kb.nextDouble();
		System.out.println("Enter your second value: ");
		double num2 = kb.nextDouble();
		System.out.println("Enter your third value: ");
		double num3 = kb.nextDouble();
		print (calcAvg(num1, num2, num3), num1, num2, num3);
		
	}
	
	public static double calcAvg(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/2;
	}
	
	public static void print(double average, double num1, double num2, double num3)
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %15.5f", average);
	} 
}