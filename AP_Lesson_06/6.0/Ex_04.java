import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int integer = kb.nextInt();
		System.out.println("Please enter the length of your table: ");
		int table = kb.nextInt();
		for(int i = 1; i <= table; i++)
		{
			int k = i*integer;
			System.out.println((i + " ") + (k + " "));
	
		
		
		}	
	}
}