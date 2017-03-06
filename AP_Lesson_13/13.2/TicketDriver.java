import java.util.Scanner;
public class TicketDriver

{
	public static void main(String[]args)
    {
	
		Ticket object = new Walkup();
		Ticket object2 = new Advance(10);
		Ticket object3 = new StudentAdvance(121);
		
		System.out.println(object);
		System.out.println(object2);
		System.out.println(object3);
	}
}