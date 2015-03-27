import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        Scanner in = new Scanner(System.in);

        System.out.println("Give me some numbers to add:");
        while (true) {
            int num = in.nextInt();
            if (num == -2) {
                break;
            }
            numbers.add(num);
        }

        System.out.println(numbers.size());
        numbers.clear();

        System.out.println(numbers.size());

        /*int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        System.out.println("Thanks! Your sum is " + sum + ".");*/

        /*ArrayList<Integer> everyOther = new ArrayList<Integer>();
        Iterator<Integer> numsIter = numbers.iterator();
        while (numsIter.hasNext()) {
            int two = numsIter.next() + numsIter.next();
            everyOther.add(two);
        }
        System.out.println(everyOther);
        System.out.println(everyOther.size());*/


    }
}
