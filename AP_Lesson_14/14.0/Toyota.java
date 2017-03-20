public class Toyota implements Location
{
	private double[] location;
	public Toyota()
	{
		location = new double[2];
	}
	public Toyota(String xy)
	{
		location = new double[2];
		String[] split = xy.split(" , ");
		move((Double.parseDouble(split[0])), (Double.parseDouble(split[1])));
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double x, double y)
	{
		location[0]+=x;
		location[1]+=y;
	}
	public double[] getLoc()
	{
		double[] location = xy;
		return location;
	}
}