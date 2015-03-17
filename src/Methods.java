/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class demonstrates methods.
 */

public class Methods {

    // Calling a method.
    public static void speak() {
        System.out.println("Hi, there!");
    }

    // Parameterizing a method.
    public static void shoutOut(String lastName) {
        System.out.println("Shout out to " + lastName + "!");
    }

    public static void shoutOutFull(String firstName, String lastName) {
        System.out.println("Shout out to " + firstName + " " + lastName + "!");
    }

    // Returning a value.
    public static String getGreeting() {
        return "Ohayo!";
    }

    public static void main(String[] args) {

        // We "call" a method by writing its name followed by open and close
        // parentheses.
        speak();

        // Methods can take "parameters", which change how the method will
        // execute.
        shoutOut("Von Neumann");

        // We can pass in multiple parameters.
        shoutOutFull("John", "Von Neumann");

        // Methods can "return" a value; the value has a type and must be
        // specified in the method's declaration.
        System.out.println(getGreeting());
    }
}