import java.util.Scanner;
public class ToyStoreRunner

{
	public static void main(String[]args)
    {
		String toys = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		ToyStore toystore = new ToyStore(toys);
		System.out.print("List..." + "\n" + toys + "\n" + toystore + "\n");
		System.out.println("\nMost Frequent Toy: " + toystore.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + toystore.getMostFrequentType());
	}
		

}