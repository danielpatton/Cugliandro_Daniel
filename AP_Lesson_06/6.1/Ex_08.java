public class Ex_08
{
	static String line1, line2, line3, line4;
	static int num1, num2, num3, num4;
	public static void main(String[]args)
	{
		line1 = "Na";
		num1 = 4;
		line2 = "Na";
		num2 = 4;
		line3 = "Hey";
		num3 = 3;
		line4 = "Goodbye!";
		num4 = 1;
		sing(line1, num1);
		System.out.println();
		sing(line2, num2);
		System.out.println();
		sing(line3, num3);
		System.out.println();
		sing(line4, num4);
	}	

	public static void sing(String one, int two)
	{
		for(int i = 0; i < two; i++)
		{
			System.out.print(one.substring(0) + " ");
			
		}	
	}
}
	