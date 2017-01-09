public class Ex_06
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers... ");
		printArray();
		System.out.println();
		System.out.println("The biggest number is " + getBiggest());
	}
	
	public static void fillArray()
	{
		for(int i = 0; i< numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	
	public static void printArray()
	{
		for (int num : numbers)
		{
			System.out.printf(num + " ");
		}
	}
	
	public static int getBiggest()
	{
		int max = 0;
		for (int num: numbers)
		{
			if( num> max)
				max = num;
		}
		return max;
	}
}