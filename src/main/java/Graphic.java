import java.io.BufferedReader;
import java.io.IOException;

public class Graphic {

    public static String drawHangman(BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }

        return content.toString();
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public Graphic() throws IOException {
    }
}
