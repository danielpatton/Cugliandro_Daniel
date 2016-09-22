import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		//scanner
		Scanner kb = new Scanner(System.in);
		
		Ex_02 form = new Ex_02(); 
		
		System.out.println("Enter your first name: ");
		String start1 = kb.next();
		System.out.println("Enter your last name: ");
		String end1 = kb.next();
		kb.nextLine();
		System.out.println("Enter your school: ");
		String start2 = kb.nextLine();
		System.out.println("Enter your school year: ");
		String end2 = kb.next();
		
		System.out.println("Enter your title: ");
		String start3 = kb.next();
		kb.nextLine();
		System.out.println("What is your subject: ");
		String end3 = kb.nextLine();
		
		System.out.println("************************************");
		form.format(start2, end2);
		form.format(start1, end1);
		form.format(start3, end3);
		System.out.println();
		System.out.println("************************************");
	}
	
	public void format(String start, String end)
	{
		System.out.printf("\n%15s  %15s%n", start, end);
	}
}