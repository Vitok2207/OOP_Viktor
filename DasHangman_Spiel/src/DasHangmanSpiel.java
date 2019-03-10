import java.util.Scanner;

public class DasHangmanSpiel {

    public static void main(String[] args) {
        String hangmanWord = "schnapsleiche";
        String usedChars = "";

        String guessedWord = "";
        for (int i = 0; i < hangmanWord.length(); i++)
            guessedWord += "_";

        for (int guesses = 0; ; guesses++) {
            if (guesses == 10) {
                System.out.printf("Nach 10 Versuchen ist jetzt Schluss. Sorry! " +
                        "Apropos, das Wort war '%s'.", hangmanWord);
                break;
            }

            System.out.printf("Runde %d. Bisher geraten: %s." +
                    "Was wählst du für ein Zeichen?%n", guesses, guessedWord);
            char guessedChar = new Scanner(System.in).next().charAt(0);

            if (usedChars.indexOf(guessedChar) >= 0)
                System.out.printf("%c hast du schon mal getippt!%n", guessedChar);
            else { // Zeichen wurde noch nicht benutzt
                usedChars += guessedChar;
                if (hangmanWord.indexOf(guessedChar) >= 0) {
                    guessedWord = "";
                    for (int i = 0; i < hangmanWord.length(); i++)
                        guessedWord += usedChars.indexOf(hangmanWord.charAt(i)) >= 0 ?
                                hangmanWord.charAt(i) : "_";

                    if (guessedWord.contains("_"))
                        System.out.printf("Gut geraten, '%s' gibt es im Wort. " +
                                "Aber es fehlt noch was!%n", guessedChar);
                    else {
                        System.out.printf("Prima, du hast das Wort '%s' erraten!",
                                hangmanWord);
                        break;
                    }
                } else { // hangmanWord.indexOf( c ) == -1
                    System.out.printf("Pech, %c kommt im Wort nicht vor!%n",
                            guessedChar);
                }
            }
        }
    }
}



