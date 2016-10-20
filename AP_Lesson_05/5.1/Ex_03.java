import java.util.Scanner;
public class Ex_03
{
	static String a, b, c, d, e, f;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input your math grade: ");
		a = kb.next();
		System.out.println("Please input your english grade: ");
		b = kb.next();
		System.out.println("Please input your science grade: ");
		c = kb.next();
		System.out.println("Please input your history grade: ");
		d = kb.next();
		System.out.println("Please input your art grade: ");
		e = kb.next();
		System.out.println("Please input your computer science grade: ");
		f = kb.next();
		double gPoints = calcPoints(a) + calcPoints(b) + calcPoints(c) + calcPoints(d) + calcPoints(e) + calcPoints(f);
		double gpa = gPoints/6;
		System.out.println("Your GPA is " + gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		else if (grade.equals("B"))
			return 3.0;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("D"))
			return 1.0;
		else if (grade.equals("F"))
			return 0.0;
		else
		return 0.0;
	}
}
 