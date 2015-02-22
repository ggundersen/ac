/**
 * Created by gwg on 2/22/15.
 */
import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        /*What is your first number? 1.1
        What is your second number? 2.2
        What is your third number? 5.5*/
        Scanner in = new Scanner(System.in);
        double first, second, third, answer;

        System.out.println("What is your first number?");
        first = in.nextDouble();
        System.out.println("What is your second number?");
        second = in.nextDouble();
        System.out.println("What is your third number?");
        third = in.nextDouble();

        answer = (first + second + third) / 2;
        System.out.println("( " + first + " + " + second + " + " + third + " ) / 2 is... " + answer);
    }
}