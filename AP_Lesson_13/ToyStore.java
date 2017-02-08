import java.util.ArrayList;
public class ToyStore 
{
	private ArrayList<String> toyList;
	
	public ToyStore()
	{
		ArrayList<String> ts = "";
	}
	public ToyStore(ArrayList<String> ts)
	{
		toyList = ts;
		loadToys(ArrayList<String> toyList);
	}
	public ArrayList loadToys(ArrayList<String> ts)
	{
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size; i++)
		{
			String name = toys[i];
			String type = toys[i] + 1;
			Toy object = new Toy(getThatToy(name));
			if (null)
			{
				if(toy = "Car")
					toys.add(Car);
				else if(toy = "AF")
					toys.add(AFigure);
			}
			else 
				count = +1; //count++;
			
		}
	}
	public String getThatToy(String nm)
	{
		for(object Toy : toyList)
		{
			if(name == nm)
				return object;
			else
				return null;
		}
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(object Toy : toyList)
		{
			if(max < count)
			{
				max = count;
				name = name;
			}
		}
		return name;
	}
	
	public int getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(object Toy : toyList)
		{
			if(object.getType == "Car")
			{
				cars++;
			}
			if(object.getType == "AF")
			{
				figures++;
			}
		}
		if(cars < figures)
			return "Cars";
		else if(figures < cars)
			return "Action Figures";
		else 
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
    {
       return toyList;
    }
}