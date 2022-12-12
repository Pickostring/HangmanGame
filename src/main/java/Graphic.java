import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Graphic {

    public static String readAllLines(BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }

        return content.toString();
    }

    public Graphic() throws IOException {
    }
}
