/**
 * Created by gwg on 3/4/15.
 */

import java.util.Scanner;

public class PrettyPrintInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("First name:");
        String firstName = keyboard.next();

        System.out.println("Last name:");
        String lastName = keyboard.next();

        System.out.println("Grade:");
        int grade = keyboard.nextInt();

        System.out.println("Student ID:");
        int studentId = keyboard.nextInt();

        System.out.println("Login:");
        String login = keyboard.next();

        System.out.println("GPA:");
        double GPA = keyboard.nextDouble();

        System.out.println("Your information");
        System.out.println("\tLogin:\t" + login);
        System.out.println("\tID:\t" + studentId);
        System.out.println("\tName:\t" + lastName + "," + firstName);
        System.out.println("\tGrade:\t" + grade);
    }
}
