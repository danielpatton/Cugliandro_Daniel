import java.util.Scanner;
public class GMC implements Location
{
	Scanner kb = new Scanner(System.in);
	private double xco, yco;
	public GMC()
	{
		xco = 0;
		yco = 0;
	}
	public GMC(double x, double y)
	{
		xco = 0;
		yco = 0;
		move(x, y);
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double x, double y)
	{
		xco+=x;
		yco+=y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xco;
		location[1] = yco;
		return location;
	}
}