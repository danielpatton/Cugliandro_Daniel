import java.util.Scanner;
public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the ending number: ");
		int end = kb.nextInt();
		System.out.println("Please enter the multiplier: ");
		int mult = kb.nextInt();
		for(int i = mult; i <= end; i+=mult)
		{
			System.out.println(i + " ");
		}	
	}
}