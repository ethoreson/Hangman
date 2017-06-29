import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class HangmanTest {

  @Test
  public void newHangman_wordArrayAccessed_Array() {
    int testInt = 0;
    ArrayList guessedArray = new ArrayList();
    Hangman newGame = new Hangman(testInt);
    String[] expected = {"apple", "banana", "orange", "boat", "hippopotamus", "exit", "shirt", "gazebo"};
    assertEquals(expected, newGame.getWordArray());
  }

  @Test
  public void newHangman_answerGeneratedRandomly_String() {
    int testInt = 0;
    ArrayList guessedArray = new ArrayList();
    Hangman newGame = new Hangman(testInt);
    String testAnswer = newGame.generateWordToGuess(newGame.getWordArray());
    assertEquals(true, testAnswer instanceof String);
  }

}
