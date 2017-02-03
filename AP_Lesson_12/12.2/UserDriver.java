import java.util.Scanner;
public class UserDriver
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = kb.next();
        System.out.println("Please enter last name: ");
        String lastName = kb.next();
        System.out.println("Would you like a public avatar? (y or n) ");
        String avatar = kb.next();
       
        if(avatar.equals("n"))
        {
            UserClass object = new UserClass(firstName, lastName);
            System.out.println(object);
        }
        else if(avatar.equals("y"))
        {
            System.out.println("Please enter avatar name: ");
            avatar = kb.next();
            UserClass object2 = new UserClass(firstName, lastName, avatar);
            System.out.println(object2);
            
        }
        
        
        
        
        
    }
}