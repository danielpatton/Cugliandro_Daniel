public class Honda implements Location
{
	private double locX, locY;
	public Honda()
	{
		locX = 0;
		locY = 0;
	}
	public Honda(double[] xy)
	{
		locX = 0;
		locY = 0;
		move(xy[0], xy[1]);
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