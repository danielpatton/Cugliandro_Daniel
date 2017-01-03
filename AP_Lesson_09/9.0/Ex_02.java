import java.util.Scanner;
public class Ex_02
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
		first(word);
	}
	
	public static void first(String[] word)
	{
		for(String name: word)
			System.out.print(name.charAt(0));
	}
}