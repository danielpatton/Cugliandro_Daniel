import java.util.Scanner;

public class Ex_01
{
	static int number, num;
	static int sum;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input value for number: ");
		number = kb.nextInt();
		sum = 0;
		num = number;
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits()
	{
		while(num > 0)
		{
			num = number/10;
			sum+=num;
			num/=10;
			int second = number % 10;
			sum+=second;
			second/=10;
		}
	}
}

