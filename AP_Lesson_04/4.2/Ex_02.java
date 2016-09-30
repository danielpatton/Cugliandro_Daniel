import java.util.Scanner;

public class Ex_02
{
	//static variable decleration
	static double num1, num2, num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first value: ");
		num1 = kb.nextDouble();
		System.out.println("Enter your second value: ");
		num2 = kb.nextDouble();
		System.out.println("Enter your third value: ");
		num3 = kb.nextDouble();
		average();
		print();
		
	}
	
	public static void average()
	{
		avg = (num1 + num2 + num3)/2;
	}
	
	public static void print()
	{
		System.out.printf("The average of your first, second, and third value is %15.5f", avg);
	}
}