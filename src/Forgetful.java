/**
 * Created by gwg on 3/4/15.
 */

import java.util.Scanner;

public class Forgetful {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word!");
        System.out.println(keyboard.next());

        System.out.println("Give me another word!");
        System.out.println(keyboard.next());

        keyboard.close();
    }
}
