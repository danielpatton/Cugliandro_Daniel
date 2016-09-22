public class Lesson_4
{
	public static void main(String[]args)
	{
		Lesson_4 form = new Lesson_4();
		
		String word1 = "bla";
		double number1 = 45678.985;
		
		form.format(word1, number1);
		
		String word2 = "burgers";
		double number2 = 90.9;
		form.format(word2,  number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%12s  %10.2f", word, number);
	}
}