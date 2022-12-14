import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Graphic {

    static BufferedReader hangman_0;
    static BufferedReader hangman_1;
    static BufferedReader hangman_2;
    static BufferedReader hangman_3;
    static BufferedReader hangman_4;
    static BufferedReader hangman_5;
    static BufferedReader hangman_6;

    static {
        try {
            hangman_0 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_0.txt"));
            hangman_1 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_1.txt"));
            hangman_2 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_2.txt"));
            hangman_3 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_3.txt"));
            hangman_4 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_4.txt"));
            hangman_5 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_5.txt"));
            hangman_6 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_6.txt"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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
        for(int i = 0; i < 50; i++) System.out.println();
    }

    public Graphic() throws IOException {
    }
}
