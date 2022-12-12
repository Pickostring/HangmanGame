import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class Game {
    public static void main(String[] args) throws IOException {

        BufferedReader hangman_0 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_0.txt"));
        BufferedReader hangman_1 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_1.txt"));
        BufferedReader hangman_2 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_2.txt"));
        BufferedReader hangman_3 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_3.txt"));
        BufferedReader hangman_4 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_4.txt"));
        BufferedReader hangman_5 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_5.txt"));
        BufferedReader hangman_6 = Files.newBufferedReader(Paths.get("src/main/resources/Hangman_6.txt"));

        System.out.println(Graphic.readAllLines(hangman_4));

    }
}