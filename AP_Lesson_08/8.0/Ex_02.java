import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first word: ");
		String word1 = kb.next();
		System.out.println("Please enter your second word: ");
		String word2 = kb.next();
		System.out.println("Please enter your final word: ");
		String word3 = kb.next();
		System.out.print(makeCenter(word1, word2, word3));
		
	}
	
	public static String makeCenter(String word1, String word2, String word3)
	{
		
		if(word.length() > 20) 
			return word;
		else 
		{
			return 0 + makeCenter(" " + word + " ");
			
		}
	}//not finished
}