import java.util.Scanner;
public class LogicalOperators
{
	static Scanner kb;
	public static void main(String[]args)
	{
		 kb = new Scanner(System.in);
		System.out.println("Pick a numbe rbetweeen 1 and 10");
		int guess = kb.nextInt();
		if(guess >= 1 && guess <= 10)
		{
			System.out.println("THe number is right!");
		}
		else
		{
			System.out.println("Wrong!");
			
		}
	}
}