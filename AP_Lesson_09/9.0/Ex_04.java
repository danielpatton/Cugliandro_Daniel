import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		System.out.println("Please enter your starting number: ");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int size = kb.nextInt();
		
		int [] seq = new int[size];
		for(int i = 0; i< seq.length; i++)
		{
			if(i == 0)
				int[i] = start;
			else
				int[i] = int[i-1]*int[i-2];
			System.out.println(int[i] + " ");
		}
	}
}