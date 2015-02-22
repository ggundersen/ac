/**
 * Created by gwg on 2/22/15.
 */
import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        int age;

        System.out.println("What is your name?");
        name = in.nextLine();

        System.out.print("How old are you?");
        age = in.nextInt();

        System.out.println("So your name is " + name + " and you are " + age + "-years-old.");
    }
}
