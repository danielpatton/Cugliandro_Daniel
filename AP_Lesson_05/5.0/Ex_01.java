import java.util.Random;

public class Ex_01
{
	//instance variables
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(7);
		computer = rand.nextInt(7);
		
		rollDice();
		
		System.out.println("Your rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + winner);
		
	

	}
	
	public static void rollDice()
	{
		if(player>computer)
			winner = "player";
		if(computer>player)
			winner = "computer";
	
	}
}	