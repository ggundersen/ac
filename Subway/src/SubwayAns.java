import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

class SubwayAns {

    public static void drawBar(Graphics2D g, Color color, int height, int count, String letter) {
        int X_OFFSET = 20;
        g.setColor(color);
        g.setStroke(new BasicStroke(9));
        g.drawString(letter, 0, height+5);
        g.drawString("" + count, count+30, height+5);
        g.drawLine(X_OFFSET, height, count + X_OFFSET, height);
    }

    public static int count(ArrayList<ArrayList<String>> lines, String subwayLine) {
        int count = 0;
        for (ArrayList<String> line : lines) {
            //System.out.println(line);
            String subwayLines = line.get(2);
            if (subwayLines.contains(subwayLine)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) throws IOException {
        DrawingPanel panel = new DrawingPanel(500, 250);
        Graphics2D g = panel.getGraphics();
        FileWrapper f = new FileWrapper("/Users/gwg/ac/Subway/src/subway-data.txt");
        ArrayList<ArrayList<String>> lines = f.getLines();

        //count(lines, "F");
        drawBar(g, new Color(0x2850ad), 10, count(lines, "A"), "A");
        drawBar(g, new Color(0x2850ad), 20, count(lines, "C"), "C");
        drawBar(g, new Color(0x2850ad), 30, count(lines, "E"), "E");

        drawBar(g, new Color(0xff6319), 40, count(lines, "B"), "B");
        drawBar(g, new Color(0xff6319), 50, count(lines, "D"), "D");
        drawBar(g, new Color(0xff6319), 60, count(lines, "F"), "F");
        drawBar(g, new Color(0xff6319), 70, count(lines, "M"), "M");

        drawBar(g, new Color(0x6cbe45), 80, count(lines, "G"), "G");

        drawBar(g, new Color(0xa7a9ac), 90, count(lines, "L"), "L");

        drawBar(g, new Color(0x996633), 100, count(lines, "J"), "J");
        drawBar(g, new Color(0x996633), 110, count(lines, "Z"), "Z");

        drawBar(g, new Color(0xfccc0a), 120, count(lines, "N"), "N");
        drawBar(g, new Color(0xfccc0a), 130, count(lines, "Q"), "Q");
        drawBar(g, new Color(0xfccc0a), 140, count(lines, "R"), "R");

        drawBar(g, new Color(0xee352e), 150, count(lines, "1"), "1");
        drawBar(g, new Color(0xee352e), 160, count(lines, "2"), "2");
        drawBar(g, new Color(0xee352e), 170, count(lines, "3"), "3");

        drawBar(g, new Color(0x00933c), 180, count(lines, "4"), "4");
        drawBar(g, new Color(0x00933c), 190, count(lines, "5"), "5");
        drawBar(g, new Color(0x00933c), 200, count(lines, "6"), "6");

        drawBar(g, new Color(0xb933ad), 210, count(lines, "7"), "7");
        drawBar(g, new Color(0x808183), 220, count(lines, "S"), "S");
    }
}