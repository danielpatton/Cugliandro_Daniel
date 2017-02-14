import java.util.ArrayList;
public class ToyStore 
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	public ToyStore(String ts)
	{
		this.loadToys(ts);
	}
	public void loadToys(String ts)
	{ 	
		toyList = new ArrayList<>();
		String[] toys = ts.split(", ");
		for(int i = 0; i < toys.length; i++)
		{
			String name = toys[i];
			String type = toys[i + 1];
			Toy toy = getThatToy(name);
			if (toy == null)
			{
				if(type.equals("Car"))
					toyList.add(new Car(name));
				else if(type.equals("AF"))
					toyList.add(new AFigure(name));
			}
			else 
				toy.setCount(toy.getCount()+1);
			
		}
	}
	public Toy getThatToy(String nm)
	{
		for(Toy toy : toyList)
		{
			if(toy.getName().equals(nm))
				return toy;
		}
		return null;
		
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		double max = Integer.MIN_VALUE;
		for(Toy yot : toyList)
		{
			if(max < yot.getCount())
			{
				max = yot.getCount();
				name = yot.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy object : toyList)
		{
			if(object.getType().equals("Car"))
			{
				cars++;
			}
			if(object.getType().equals("AF"))
			{
				figures++;
			}
		}
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else 
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
    {
       return toyList.toString();
    }
}