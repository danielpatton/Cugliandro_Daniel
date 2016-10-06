import java.util.Scanner;

public class Ex_01
{
	static int l, w;
	static int perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your length? ");
		l = kb.nextInt();
		System.out.println("What is your width? ");
		w = kb.nextInt();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*(l+w));
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is  " + perimeter + " ft around.");
	}
}