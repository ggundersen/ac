/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class counts from 0 to 100, replacing any number divisible by 3 with
 * the word "Fizz" and any word divisible by 5 with "Buzz". See:
 * http://en.wikipedia.org/wiki/Fizz_buzz.
 */

public class FizzBuzz {

    public static void main(String[] args) {
        //f1();
        f2();
    }

    public static void f1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void f2() {
        for (int i = 1; i <= 100; i++) {
            String line = "";
            if (i % 3 == 0) {
                line += "Fizz";
            }
            if (i % 5 == 0) {
                line += "Buzz";
            }
            if (line == "") {
                line = Integer.toString(i);
            }
            System.out.println(line);
        }
    }
}