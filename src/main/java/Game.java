import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You want to play a game? (y/n)");
        String firstAnswer = scanner.nextLine();
//        <!--Start game--->
        if (firstAnswer.equals("y")) {
            Dictionary.fillDict();
            String word = Dictionary.getRandomWord();
            int errors = 0;
            boolean start = true;

            ArrayList<String> knownCharsList = new ArrayList<>();
            ArrayList<String> fullWordList = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                fullWordList.add(String.valueOf(word.charAt(i)));
            }
            Graphic.clearConsole();
//            <!--Game cycle--->
            while (errors < 6) {
//                <!--Add first known chars--->
                if (start) {
                    int chars = 0;
                    while (chars < 2) {
                        String temp = Dictionary.getRandomChar(fullWordList);
                        if (!knownCharsList.contains(temp)) {
                            knownCharsList.add(temp);
                            chars++;
                        }
                    }
                    start = false;
                }

                switch (errors) {
                    case 0:
                        System.out.println(Graphic.drawHangman(
                                Files.newBufferedReader(Paths.get("src/main/resources/Hangman_0.txt"))
                        ));
                        break;
                    case 1:
                        System.out.println(Graphic.drawHangman(
                                Files.newBufferedReader(Paths.get("src/main/resources/Hangman_1.txt"))
                        ));
                        break;
                    case 2:
                        System.out.println(Graphic.drawHangman(
                                Files.newBufferedReader(Paths.get("src/main/resources/Hangman_2.txt"))
                        ));
                        break;
                    case 3:
                        System.out.println(Graphic.drawHangman(
                                Files.newBufferedReader(Paths.get("src/main/resources/Hangman_3.txt"))
                        ));
                        break;
                    case 4:
                        System.out.println(Graphic.drawHangman(
                                Files.newBufferedReader(Paths.get("src/main/resources/Hangman_4.txt"))
                        ));
                        break;
                    case 5:
                        System.out.println(Graphic.drawHangman(
                                Files.newBufferedReader(Paths.get("src/main/resources/Hangman_5.txt"))
                        ));
                        break;
                }

                for (int i = 0; i < fullWordList.size(); i++) {
                    for (int j = 0; j < knownCharsList.size(); j++) {
                        if (knownCharsList.contains(fullWordList.get(i))) {
                            System.out.print(fullWordList.get(i));
                            break;
                        } else {
                            if (j == knownCharsList.size() - 1) System.out.print("_");
                        }
                    }
                }

                System.out.println();
                System.out.println();
                System.out.println("Enter letter");
                String answer = scanner.nextLine();
                if (fullWordList.contains(answer) && !knownCharsList.contains(answer)) {
                    Graphic.clearConsole();
                    knownCharsList.add(answer);
                } else {
                    Graphic.clearConsole();
                    errors++;
                }

            }

            if (errors == 6) {
                System.out.println(Graphic.drawHangman(
                        Files.newBufferedReader(Paths.get("src/main/resources/Hangman_6.txt"))
                ));
                System.out.println("You lose!");
                scanner.nextLine();
            }

        } else if (firstAnswer.equals("n")) {
            System.out.println("See you next time");
            scanner.nextLine();

        }




    }
}