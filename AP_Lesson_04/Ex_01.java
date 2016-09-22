import java.util.Scanner; //import Statement

public class Ex_01
{
	public static void main(String[]args)
	{
		//scanner
		Scanner kb = new Scanner(System.in);
		
		Ex_01 form = new Ex_01();
		
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
		
		//Printing items
		form.format(word1, number1);
		form.format(word2, number2);
		form.format(word3, number3);
		form.format(word4, number4);
		
		//calculte subtotal
		double subtotal = number1 + number2 + number3 + number4;
		double tax = subtotal * 0.8;
		double total = subtotal + tax;
		
		System.out.println();
		System.out.println("------------------------------------");
		form.format("Subtotal:", subtotal);
		form.format("Tax:" ,tax);
		form.format("Total:" ,total);
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("*Thanks for shopping, have a great day!*");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%15s  %15.2f", word, number);
	}
}