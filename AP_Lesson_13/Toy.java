public class Toy
{
	private String name;
	private double count;
	public Toy()
	{
		name = "";
		count = 1;
	}
	public Toy(String nm)
	{
		name = nm;
		count = 1;
	}
	public void setName (String nm)
    {
       name = nm;
    }
	public void setCount (String c)
    {
       count = c;
    }
	public String getName()
    {
        return name;
    }
	public String getCount()
    {
        return count;
    }
	public String getType()
    {
        //abstract method
    }
	public String toString()
    {
       return "Item information: " + name + count;
    }
}	
