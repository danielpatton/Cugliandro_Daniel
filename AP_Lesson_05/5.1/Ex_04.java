import java.util.Scanner; 

public class Ex_04
{
	static double BMI;
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("This program will calculate your BMI. \nWhat is your height in inches?");
		double height = kb.nextDouble();
		System.out.println("What is your weight in pounds?");
		double weight = kb.nextDouble();
		BMI = 703 * (weight/(height*height));
		System.out.printf("Your BMI is %.2f\n", BMI);
		calcCondish();
		System.out.println("You are " + condition);
	
	}
	public static void calcCondish()
	{
		if (BMI>39.9)
			condition = "morbidly obese";
		else if (BMI>=35)
			condition = "very obese";
		else if (BMI>=29.9)
			condition =  "obese";
		else if (BMI>=25)
			condition =  "overweight";
		else if (BMI>=18.5)
			condition =  "normal";
		else 
			condition = "underweight";
	}
}