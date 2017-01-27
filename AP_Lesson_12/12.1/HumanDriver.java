import java.util.Scanner;
public class HumanDriver
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter hair color: ");
        String hair = kb.next();
        System.out.println("Please enter eye color: ");
        String eyes = kb.next();
        System.out.println("Please enter skin: ");
        String skin = kb.next();
        
        Human object = new Human(hair, eyes, skin);
        System.out.println("My info...... " +
                           " Hair: " + object.getHair() +
                           " Eyes: " + object.getEyes() +
                           " Skin: " + object.getSkin());
        
        object.setHES(hair, eyes, skin);
        System.out.println("Please enter hair color: ");
        hair = kb.next();
        System.out.println("Please enter eye color: ");
        eyes = kb.next();
        System.out.println("Please enter skin: ");
        skin = kb.next();
        
        System.out.println("Friend's info...... " +
                           " Hair: " + object.getHair() +
                           " Eyes: " + object.getEyes() +
                           " Skin: " + object.getSkin());
    }
}
                           
                           
                           
                           
            
        