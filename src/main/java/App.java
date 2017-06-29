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
        if (player.checkIfGameOver()) {
          System.out.println("YOU WIN!");
          player.setGameOver(true);
        }
      } else {
        System.out.println("No!");
        System.out.println(player.getGuessesLeft() + " guesses remaining");
        player.countAppearances(userGuess);
        if (player.getGuessesLeft() == 0) {
          System.out.println("YOU LOSE!");
          player.setGameOver(true);
        }
      }

    }
  }
}
