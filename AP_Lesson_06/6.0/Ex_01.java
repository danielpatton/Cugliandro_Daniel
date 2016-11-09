import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your string: ");
		String box = kb.next();
		for(int i = 0; i < box.length(); i++)
		{
			System.out.println(box.substring(0));
		}	
	}
}