/**
 * Created by gwg on 3/5/15.
 */

import java.util.Scanner;

public class IfThen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your password?");

        String password = in.next();

        if (password == "1234") {
            System.out.println("Logged in.");
        }
    }
}
