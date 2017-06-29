import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class HangmanTest {

  @Test
  public void newHangman_wordArrayAccessed_Array() {
    ArrayList guessedArray = new ArrayList();
    Hangman newGame = new Hangman();
    String[] expected = {"moor", "room", "moro"};
    assertEquals(expected, newGame.getWordArray());
  }

  @Test
  public void newHangman_answerGeneratedRandomly_String() {
    Hangman newGame = new Hangman();
    String testAnswer = "";
    newGame.generateWordToGuess(newGame.getWordArray());
    assertEquals(true, testAnswer instanceof String);
  }

  @Test
  public void newHangman_GameReturnsTrue_Boolean() {
    Hangman newGame = new Hangman();
    newGame.generateWordToGuess(newGame.getWordArray());
    String userGuess = "r";
    Boolean shouldBeTrue = newGame.isLetterInWord(userGuess);
    assertEquals(true, shouldBeTrue);
  }

  @Test
  public void newHangman_GameReturnsFalse_Boolean() {
    Hangman newGame = new Hangman();
    newGame.generateWordToGuess(newGame.getWordArray());
    String userGuess = "f";
    Boolean shouldBeFalse = newGame.isLetterInWord(userGuess);
    assertEquals(false, shouldBeFalse);
  }

  @Test
  public void newHangman_UpdateAlreadyGuessedArray_ArrayList() {
    Hangman newGame = new Hangman();
    newGame.generateWordToGuess(newGame.getWordArray());
    String userGuess = "a";
    ArrayList testOutput = new ArrayList();
    testOutput.add(userGuess);
    newGame.addToGuessedArray(userGuess);
    assertEquals(newGame.getAlreadyGuessed(), testOutput);
  }

  @Test
  public void newHangman_RepeatWordsCountAsDouble_int() {
    Hangman newGame = new Hangman();
    newGame.generateWordToGuess(newGame.getWordArray());
    String userGuess = "o";
    newGame.addToGuessedArray(userGuess);
    int expected = 2;
    assertEquals(expected, newGame.countAppearances(userGuess));
  }

  @Test
  public void newHangman_CheckHowManyGuessesAreLeft_int() {
    Hangman newGame = new Hangman();
    newGame.generateWordToGuess(newGame.getWordArray());
    String userGuess = "a";
    newGame.countAppearances(userGuess);
    String userGuess2 = "b";
    newGame.countAppearances(userGuess2);
    String userGuess3 = "c";
    newGame.countAppearances(userGuess3);
    int expected = 7;
    assertEquals(expected, newGame.getGuessesLeft());
  }
}
