import java.util.Scanner; //import Statement

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("This program will calculate your BMI. \nWhat is your height in inches?");
		double height = kb.nextDouble();
		System.out.println("What is your weight in pounds?");
		double weight = kb.nextDouble();
		double BMI = 703 * (weight/(height*height));
		System.out.println("Your BMI is " + BMI);
		
		
		
		
	}
}	