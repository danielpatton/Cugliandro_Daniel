import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		//scanner
		Scanner kb = new Scanner(System.in);
		
		Ex_03 CI = new Ex_03();
		System.out.println("What is your interest rate? ");
		double r = kb.nextDouble();
		System.out.println("What is the original amount you intend to borrow? ");
		double p = kb.nextDouble();
		System.out.println("How many times per year is your loan compounded? ");
		double n = kb.nextDouble();
		System.out.println("What is the life of the loan? ");
		double t = kb.nextDouble();
		double CompInt = CI.calcCI(r,p,n,t);
		System.out.printf("Your total monthly payment is \n%15.2f", CompInt);
		
	}
	public double calcCI(double r1, double p1, double n1, double t1)
	{
		return p1*(Math.pow(1 + r1/n1,(n1*t1)));
	}
}