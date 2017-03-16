public class Circle implements CutShapes
{
	private double radius;
	private double number;
	
	public Circle()
	{
		radius = 0;
	}
	public Circle(double r)
	{
		radius = r;
		number = 0;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return Math.PI * (Math.pow(radius, 2));
	}
}