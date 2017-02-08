public abstract class Toy
{
	private String name;
	private double count;
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	public Toy(String nm)
	{
		this.name = nm;
		this.count = 1;
	}
	public void setName (String nm)
    {
       this.name = nm;
    }
	public void setCount (double c)
    {
       this.count = c;
    }
	public String getName()
    {
        return name;
    }
	public double getCount()
    {
        return count;
    }
	public abstract String getType();
    
	public String toString()
    {
       return "Item information: " + name + ", " + count;
    }
}	
