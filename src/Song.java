/**
 * Created by gwg on 2/22/15.
 */

public class Song {

    private static final String[] day2gift;
    private static final String[] day2ordinal;
    static {
        day2gift = new String[] {
            "a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "calling Birds",
            "gold rings", "geese a-laying", "swans a-swimming", "maids a-milking",
            "ladies dancing", "lords a-leaping", "pipers piping", "drummers drumming"
        };
        day2ordinal = new String[] {
            "first", "second", "third", "fourth",
            "fifth", "sixth", "seventh", "eighth",
            "ninth", "tenth", "eleventh", "twelfth"
        };
    }

    private static void stanza(int day) {
        String indent = "  ";
        System.out.println("On the " + day2ordinal[day] + " day of Christmas my true love gave to me");
        for (int i = day; i >= 0; i--) {
            if (i == 0 && day != 0)
                System.out.println(indent + "and " + day2gift[i]);
            else
                System.out.println(indent + day2gift[i]);
        }
    }

    public static void main(String[] args) {
        for (int day = 0; day < 12; day++) {
            stanza(day);
            if (day != 12)
                System.out.println("");
        }
    }
}