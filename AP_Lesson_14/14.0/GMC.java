import java.util.Scanner;
public class GMC implements Location
{
	private double locX, locY;
	public GMC()
	{
		locX = 0;
		locY = 0;
	}
	public GMC(double x, double y)
	{
		locX = 0;
		locY = 0;
		move(x, y);
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double x, double y)
	{
		locX+=x;
		locY+=y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = locX;
		location[1] = locY;
		return location;
	}
}