import java.util.Scanner;
public class GMC implements Location
{
	Scanner kb = new Scanner(System.in);
	private int x, y;
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public int move(int x, int y)
	{
		System.out.println("Please enter x coordinates: ");
		x = kb.next();
		System.out.println("Please enter y coordinates: ");
		y = kb.next();
	}
	public double[] getLoc(double[] location)
	{
		double[] location = new double[2];
		loc = x + y;
		return double[] location;
	}
}