import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You want to play a game? (y/n)");
        String firstAnswer = scanner.nextLine();

//        <!--Start game--->
        if(firstAnswer.equals("y")) {
            Dictionary.fillDict();
            String word = Dictionary.getRandomWord();
            int errors = 0;
            boolean start = true;

            ArrayList<String> knownChars = new ArrayList<>();
            ArrayList<String> fullWord = new ArrayList<>();
            for(int i = 0; i < word.length(); i++) {
                fullWord.add(String.valueOf(word.charAt(i)));
            }
            Graphic.clearConsole();
//        <!--Game cycle--->
            while(errors < 6) {
//        <!--First known chars--->
                if(start) {
                    int chars = 0;
                    while(chars < 2) {
                        String temp = Dictionary.getRandomChar(fullWord);
                        if(!knownChars.contains(temp)) {
                            knownChars.add(temp);
                            chars++;
                        }
                    }
                    start = false;
                }
                switch (errors) {
                    case 0: System.out.println(Graphic.drawHangman(Graphic.hangman_0));
                        break;
                    case 1: System.out.println(Graphic.drawHangman(Graphic.hangman_1));
                        break;
                    case 2: System.out.println(Graphic.drawHangman(Graphic.hangman_2));
                        break;
                    case 3: System.out.println(Graphic.drawHangman(Graphic.hangman_3));
                        break;
                    case 4: System.out.println(Graphic.drawHangman(Graphic.hangman_4));
                        break;
                    case 5: System.out.println(Graphic.drawHangman(Graphic.hangman_5));
                        break;
                    default: System.out.println(Graphic.drawHangman(Graphic.hangman_0));
                }

                for(int i = 0; i < fullWord.size(); i++) {
                    for(int j = 0; j < knownChars.size(); j++) {
                        if(knownChars.contains(fullWord.get(i))) {
                            System.out.print(fullWord.get(i));
                            break;
                        } else {
                            if(j == knownChars.size()-1) System.out.print("_");
                        }
                    }
                }

                System.out.println();
                System.out.println();
                System.out.println("Enter letter");
                String answer = scanner.nextLine();
                if(fullWord.contains(answer) && !knownChars.contains(answer)) {
                    knownChars.add(answer);
                    Graphic.clearConsole();
                } else {
                    errors++;
                    Graphic.clearConsole();
                }

            }

            if(errors == 6) {
                System.out.println(Graphic.drawHangman(Graphic.hangman_6));
                System.out.println("You lose!");
                scanner.nextLine();
            }

        } else if(firstAnswer.equals("n")){
            System.out.println("See you next time");
            scanner.nextLine();

        }



    }
}