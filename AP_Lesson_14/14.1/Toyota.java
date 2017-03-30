public class Toyota extends Car
{
	public Toyota()
	{
		super();
	}
	public Toyota(String xy)
	{
		super();
		String[] split = xy.split(", ");
		move((Double.parseDouble(split[0])), (Double.parseDouble(split[1])));
	}
	
}