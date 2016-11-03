import java.util.Scanner;
public class Ex_06
{
	static Scanner kb;
	static String username;
	static String password;
	static String password1;
	static String username1;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter your username: ");
		username1 = kb.next();
		username = "TPHS";
		//username1 = "TPHS";
		
		System.out.println("Please enter your password: ");
		password1 = kb.next();
		password = "falcons";
		//password1 = "falcons";
		
		if(username1.equals(username) &&  password1.equals(password))
			System.out.println("You are granted access.");
		
		else if(username1.equals("TPHS"))
		{
			System.out.println("Your password is incorrect!");
			passCheck();
		}	
		else if(password1.equals("falcons"))
		{	
			System.out.println("Your username is incorrect!");
		
		}
		else
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}
		
		
	}
}