import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Hangman player = new Hangman(10);
    player.generateWordToGuess(mWordArray);

    System.out.println("Welcome to Hangman!");
    System.out.println("~~~~~~~~~~~~~~~~~~~");
    System.out.println("Enter a letter you think is in the word");
    String userGuess = myConsole.readLine();


    player.addToGuessedArray(userGuess);
    player.isLetterInWord(userGuess);
  }
}
