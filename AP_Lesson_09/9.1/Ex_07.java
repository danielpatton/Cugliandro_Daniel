import java.util.Scanner;
public class Ex_07
{
	static String [] words;
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		System.out.println("For the words ");
		printArray();
		System.out.println();
		System.out.println("Only " + hasZs() + " contains the letter z.");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words: ");
		
		for(int i = 0; i< words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for (String w: words)
		{
			System.out.printf(w + " ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for (String w: words)
		{
			if(w.indexOf("z") !=-1)
			{
				zs += w;
				zs += " ";
			}
		}

		return zs ;
	}
}