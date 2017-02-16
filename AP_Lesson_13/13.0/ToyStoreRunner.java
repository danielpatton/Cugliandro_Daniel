import java.util.Scanner;
public class ToyStoreRunner

{
	public static void main(String[]args)
    {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter toys: ");
		ToyStore toystore = new ToyStore(kb.nextLine());
		System.out.print("List..." + toystore + "\n");
		System.out.println("\nMost Frequent Toy: " + toystore.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + toystore.getMostFrequentType());
	}
		

}