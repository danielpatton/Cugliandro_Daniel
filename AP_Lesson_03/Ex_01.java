import java.util.Scanner; //import Statement

public class Ex_01
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner pbject "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//Name 
		System.out.println ("Hi! My name is RudeAI. ");
		System.out.println ("I would like to interview you. Let me start by asking you a few questions ");
		System.out.println ("What is your name? ");
		
		//Age
		String name = keyboard.next();
		System.out.println(name + "? " + "What kind of name is " + name + "?!. I feel really bad for you. ");
		System.out.println("How long have you had this name for? How old are you? ");
		
		String age = keyboard.next();
		System.out.println("Since you are " + age + " years old, you don't have that much time left anyways...");
		System.out.println("In all these " + age + " years, what have you done for fun? ");
		
		//fun
		String fun = keyboard.next();
		System.out.println(fun + " is an interesting hobby, but I would never expect somebody like you to do it. ");
		System.out.println("Now I know that you have weird hobbies, but what kind of music do you listen to? ");
		
		//music
		String music = keyboard.next();
		System.out.println("I would not even consider " + music + " a genre. ");
		System.out.println("Do your siblings listen to that same type of music? ");
		System.out.println("Talking about siblings, how many do you have? ");
		
		//siblings
		int sibling = keyboard.nextInt();
		System.out.println(sibling + " siblings? I wouldn't want to be in their position. ");
		System.out.println("Finally, do you want to be anything when you grow up?");
		
		//grow
		String grow = keyboard.next();
		System.out.println("That is an interesting profession. But I doubt you'll ever succeed. Even by becoming a " + grow);
		
	}
}	