/**
 * Created by gwg on 3/5/15.
 */

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please say something.");
        int someNumber = keyboard.nextInt();
        System.out.println(someNumber);
    }
}
