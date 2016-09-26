public class Lesson_02
{
	public static void main(String[]args)
	{
		//variables
		int n1 = 4;
		int n2 = 12;
		int total = n1 * n2;
		String n = " Daniel Cugliandro";
		String a = " 4161 Street ";
		String c = " San Diego ";
		int z = 92130;
		int l = 5;
		int w = 8;
		int h = 2;
		int surArea = 2*w*l + 2*l*h + 2*h*w;
		
		//Multiplication
		System.out.println(" ");
		System.out.println("Multiplication:");
		System.out.println(n1 + " multiplied by " + n2 + " is " + total);
		
		//Concatenation
		System.out.println(" ");
		System.out.println("Address:");
		System.out.println(n);
		System.out.println(a);
		System.out.println(c + z);
		
		
		//Complex Calculation
		System.out.println();
		System.out.println("Concatenation: ");
		System.out.println("The surface area of your rectangle is " + surArea);
	}
}