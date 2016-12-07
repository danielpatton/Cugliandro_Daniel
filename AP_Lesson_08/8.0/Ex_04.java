import java.util.Scanner;
public class Ex_04
{
	static int start;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = kb.next();
		int stop = word.length();
		
		System.out.println(tree(word, start, stop));	
	}
	
	public static String tree(String word, int start, int stop)
	{
		if(start<=stop)
		{
			System.out.printf("\n%15s", word.substring(0, start));
			start+=1;
			return tree(word, start, stop);
		}	
		else
			return " ";
	} 
}