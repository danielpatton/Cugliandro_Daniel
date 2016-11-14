import java.util.Scanner;
public class Ex_07
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		sing();
		
	}	
	public static void sing()
	{
		System.out.println("Please enter a word: ");
		String word = kb.next();
		System.out.println("Enter the number of times this word will be repeated: ");
		int number = kb.nextInt();
		for(int i = 0; i=number; i++)
			{
					System.out.println(word);
					

			}	
		}
		
	}
}