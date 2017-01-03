import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		String [] word = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words: ");
		
		for(int i = 0; i< word.length; i++)
		{
			word[i] = kb.next();
		}
		
		System.out.println("In order...");
		for(String w : word)
		{
			System.out.print(w + " ");
		}
		System.out.println("\n");
		System.out.println("Reversed... ");
		reverse(word);
	}
	
	public static void reverse(String[] word)
	{ 
		int i = 0;
		for(i = word.length - 1; i >= 0; i--)
		{	
			System.out.print(word[i]+ " "); 
		}
	}
}