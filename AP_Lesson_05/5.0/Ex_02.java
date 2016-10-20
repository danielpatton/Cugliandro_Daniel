import java.util.Scanner;
public class Ex_02
{
	//instance variables
	static double disc;
	static double subtotal;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Ex_02 form = new Ex_02();
		
		//User Input
		System.out.printf("<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>>");
		System.out.println();
		System.out.printf("Please enter item 1: ");
		String word1 = kb.next();
		System.out.printf("Please enter the price: ");
		Double number1 = kb.nextDouble();
		
		System.out.printf("Please enter item 2: ");
		String word2 = kb.next();
		System.out.printf("Please enter the price: ");
		Double number2 = kb.nextDouble();
		
		System.out.printf("Please enter item 3: ");
		String word3 = kb.next();
		System.out.printf("Please enter the price: ");
		Double number3 = kb.nextDouble();
		
		System.out.printf("Please enter item 4: ");
		String word4 = kb.next();
		System.out.printf("Please enter the price: ");
		Double number4 = kb.nextDouble();
		
		//subtotal, discount, tax, and total
		subtotal = number1 + number2 + number3 + number4;
		discount();
		double tax = 0.08*subtotal;
		double total = subtotal - disc + tax;
		
		//format print statements
		form.format(word1, number1);
		form.format(word2, number2);
		form.format(word3, number3);
		form.format(word4, number4);
		form.format("Subtotal: ", subtotal);
		form.format("Tax:", tax);
		form.format("Discount: ", disc);
		form.format("Total: ", total);
		
		System.out.println("\n_______________________________________________________\n");
		System.out.println("Thank you for shopping with us!");
	}
	
	public static void discount()
	{
		if(subtotal >- 2000)
			 disc = .15*subtotal;
		if(subtotal<2000)
			 disc = 0*subtotal;
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%15s  %15.2f", word, number);
	}
	
}