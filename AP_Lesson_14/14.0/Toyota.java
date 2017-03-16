public class Toyota implements Location
{
	private static double[] location = new double[];
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(int x, int y)
	{
		System.out.println("Please enter x coordinates: ");
		x = kb.next();
		System.out.println("Please enter y coordinates: ");
		y = kb.next();
	}
	public void getLoc(double[] location)
	{
		double[] location = new double[];
		loc = x + y;
		return double[] loc;
	}
}