/**
 * Created by gwg on 3/4/15.
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How old are you?");
        short age = keyboard.nextShort();

        System.out.println("How tall are you?");
        String height = keyboard.next();

        System.out.println("How much do you weigh?");
        double weight = keyboard.nextDouble();

        System.out.println("You are " + age + " years old, " + height + " tall, and " + weight + " pounds");
        keyboard.close();
    }
}
