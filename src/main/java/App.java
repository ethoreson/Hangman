import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Hangman player = new Hangman();
    String[] array = player.getWordArray();
    player.generateWordToGuess(array);
    System.out.println("Welcome to Hangman!");
    while (player.getGameOver() == false) {
      System.out.println("~~~~~~~~~~~~~~~~~~~");
      System.out.println("Enter a letter you think is in the word");
      String userGuess = myConsole.readLine();
      player.addToGuessedArray(userGuess);
      if (player.isLetterInWord(userGuess)) {
        System.out.println("Correct!");
        player.countAppearances(userGuess);
        // check if game has been won
        if (player.checkIfWon()) {
          System.out.println("YOU WIN!");
          player.setGameOver(true);
        }
      } else {
        System.out.println("No!");
        // check if game has been lost
      }

    }
  }
}
