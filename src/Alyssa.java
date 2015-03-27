/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class asks the user for a word and then repeats it back to them.
 *
 * Like this: https://www.youtube.com/watch?v=CRse-IePpbE.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Alyssa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();
        System.out.println("Please give me a word");
        String word = in.next();

        for (int i = 0; i < word.length(); i++) {
            wordList.add("" + word.charAt(i));
        }

        String result = "";
        for (int i = wordList.size()-1; i >= 0; i--) {
            result += wordList.get(i);
        }

        System.out.println(result);
    }
}
