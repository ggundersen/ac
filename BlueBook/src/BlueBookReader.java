import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BlueBookReader {

    public BlueBookReader() throws IOException {
        Scanner in = new Scanner(new FileReader("bluebook.txt"));
        String line;
        while (in.hasNext()) {
            line = in.nextLine();
            System.out.println(line);
        }

        /*while ((newLine = readbuffer.readLine()) != null) {
            System.out.println(newLine);
        }*/
    }

    public static String getNextLine() {


        return "";
    }

    public static void main(String[] args) throws IOException {
        new BlueBookReader();
    }
}
