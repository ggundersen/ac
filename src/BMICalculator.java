/**
 * Access Code 2.1
 * Gregory Gundersen
 *
 * This class asks for a user's weight and mass and then calculates their body
 * mass index.
 */

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your height in m:");
        double height = in.nextDouble();

        System.out.println("Your weight in kg:");
        double weight = in.nextDouble();

        double BMI = weight / (height*height);
        System.out.println("Your BMI is " + BMI);
    }
}
