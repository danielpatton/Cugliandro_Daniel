public class Car implements Location
{
	double[] location;
	public final int ID;
	
	public Car()
	{
		location = double[2];
	}
	public void move(double x, double y);
	
	public double[] getLoc()
	{
		return location;
	}
}