import java.util.Scanner;
public class Space_Shooter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your target: ");
		int target = kb.nextInt();
		int enemyLoc = (int)(Math.random()*100);
		
		if (target == enemyLoc)
			System.out.println("It's a hit!");
		else //for all other conditions excluding the if
			System.out.println("You missed! ");
	}
}