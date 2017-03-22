public class Car
{
	private double[] location;
	public final int ID;
	
	public Car()
	{
		location = new double[2];
	}
	public Car()
	{
		location = new double[2];
		String[] split = xy.split(", ");
		move((Double.parseDouble(split[0])), (Double.parseDouble(split[1])));
	}
	public int getID()
	{
		return ID;
	}
	public void move(double )
}