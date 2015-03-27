import java.util.ArrayList;
import java.util.Scanner;

public class NameTracker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        System.out.println("Please give me some names:");
        while (true) {
            String newName = in.nextLine();
            if (newName.equals("")) {
                break;
            }
            names.add(newName);
        }
        System.out.println("Your " + names.size() +" name(s) are saved!");

        for (int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }



        System.out.println(names.contains("Aileen"));
    }
}
