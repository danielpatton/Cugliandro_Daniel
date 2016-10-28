import java.util.Scanner;
public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello! Welcome to Adventure Game 2016." +
							"\n\"Since Halloween is coming up, you decide to venture through the woods late at night." +
							"\n You continue wandering until you spot an abandoned cabin. \"" +
							"\n You: [1] Enter the cabin" +
							"\n [2] Avoid the cabin, and continue wandering the woods" +
							"\n [3] Decide that the cabin is too spooky, and head back.");
		
						
		int choice = kb.nextInt();
		if (choice == 1)
		{
			System.out.println("You enter the cabin, and find several dead corpses scattered throughout." +
								"\n [1] You continue exploring the house" +
								"\n [2] You start running as fast as you can");
			int choice1 = kb.nextInt();					
			if (choice1 == 1)
			{
				System.out.println("You continue exploring, and find the key to a locked room " +
									"\n [1] Find the door and open it" +
									"\n [2] Swallow the key so nobody can open that room");
				int choice2 = kb.nextInt();
				if (choice2 == 1)
					System.out.println("The room is filled with eerie items, yet you spot a chocolate bar. You unwrap it and eat it.");
				else
					System.out.println("The key is too large, so you choke and die.");
			}
			
			else
			{
				System.out.println("You escaped the house, but can still see it." +
								"\n[1] You close your eyes and continue running" +
								"\n[2] You stop to catch your breath");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
					System.out.println("Why would you run with your eyes closed? You run into a tree and get knocked out.");
				else
					System.out.println("You eventually recuperate, and walk home.");
			}
		}
		
		else if (choice == 2)
		{
			System.out.println("You continue exploring and eventually find yourself near a freeway" +
								"\n [1] You try to hitchhike a ride home" +
								"\n [2] You try to cross the freeway");
			int choice5 = kb.nextInt();
			if (choice5 == 1)
			{
				System.out.println("You find a ride home, from the police. You shouldn't have stayed out past your curfew." +
									"\n [1] You kock out both officers and steal the car" +
									"\n [2] You take responsibility for your mistakes, and remain in the car");
				int choice6 = kb.nextInt();
				if (choice6 == 1)
					System.out.println("There's a camera in the car. Get ready for jailtime.");
				else
					System.out.println("You stay in jail for the night, and regret your mistake.");
			}
			
			else
			{
				System.out.println("Cars are constantly passing by:" +
									"\n [1] You just go for it" +
									"\n [2] You wait until the road is open");
				int choice7 = kb.nextInt();
				if (choice7 == 1)
					System.out.println("You get hit by a car. Always look both ways before crossing");
				else
					System.out.println("The road is never clear, so you doze off into sleep.");
			}	
		}	
		
		else 
		{
			System.out.println("Upon heading back, you encounter a lost family" +
								" [1] Ask them if they are lost " +
								" [2] Continue on your path back home");
			int choice8 = kb.nextInt();
			if (choice8 == 1)
			{
				System.out.println("You go apporach them and ask them if they are lost; however they ask you for directions to the cabin you just came from." +
									"[1] Lead them to the cabin" +
									"[2] Refuse their request and continue back home");
				int choice9 = kb.nextInt();
				if (choice9 == 1)
					System.out.println("You lead them back to the cabin, where they \"invite you in\" for tea; however, they end up kidnapping you");
				else
					System.out.println("You continue on your path, and make it home safe.");
				
			}
			else
			{
				System.out.println("On your path back home, you find a bag. Upon further inspection, you notice it is filled with drugs and money" +
									"[1] Take the bag" +
									"[2] Go home");
				int choice10 = kb.nextInt();
				if (choice10 == 1)
					System.out.println("You take the bag home, and end up $100,000 richer.");
				else
					System.out.println("You continue your path home, however, upon arriving you realize you forgot to lock your house. Everything in your house has been robbed.");
			}	
		}	
	}
}
