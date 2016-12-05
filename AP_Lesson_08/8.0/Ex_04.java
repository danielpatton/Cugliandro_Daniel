import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = kb.next();
		int stop = word.length();
		int start = 0;
		System.out.print(tree(word, start, stop));
	}
	
	public static String tree(String word, int start, int stop)
	{
		if(start<=stop)
		{
			System.out.print(word.substring(0, start));
			start+=1;
			tree(word, start, stop);
		}	//not finished
	}
}