import java.util.Scanner;
public class Ex_06
{
	static Scanner kb;
	static String username;
	static String password;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		username = TPHS;
		password = falcons;
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter your username");
		String username1 = kb.next();
		
		System.out.println("Please enter your password");
		String password1 = kb.next();
		
		if(username1 == username && password1 = password)
			System.out.println("You are granted access");
		else if (username1 == username)
			System.out.println("Your password is incorrect!");
		else if (password1 == password)
			System.out.println("Your username is incorrect!");
		else
			System.out.println("Your username and password are incorrect!");
		passCheck();
	}
}