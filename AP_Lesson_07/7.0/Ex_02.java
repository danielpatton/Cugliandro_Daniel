import java.util.Scanner;

public class Ex_02
{
	static int number, num, digits = 0, average = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input value for number: ");
		number = kb.nextInt();
		num = number;
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits = (int)Math.log10(number) + 1;
			num = number % 10;
			average+=num;
			num/=10;
			average = average/digits;
		}
		//lab is not done yet
	}
}

