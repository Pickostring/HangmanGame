import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Dictionary {

    static ArrayList<String> words = new ArrayList<>();
    public static void fillDict() throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/Words.txt"));
        String line = reader.readLine();
        while(line != null) {
            String[] wordsLine = line.split(" ");
            for(String word : wordsLine) {
                words.add(word);
            }
            line = reader.readLine();
        }
    }

    public static String getRandomWord() {
        Random rand = new Random(System.currentTimeMillis());
        return words.get(rand.nextInt(words.size()));
    }

    public static String getRandomChar(ArrayList word) {
        Random rand = new Random(System.currentTimeMillis());
        return  word.get(rand.nextInt(word.size())).toString();
    }

}
