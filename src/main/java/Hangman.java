import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Hangman {
  private String[] mWordArray = {"apple", "banana", "orange", "boat", "hippopotamus", "exit", "shirt", "gazebo"};
  private String mAnswer;
  private int mGuessesLeft;
  private ArrayList mAlreadyGuessed = new ArrayList();

  public Hangman(int guessesLeft) {

  }

  public int getGuessesLeft() {
    return mGuessesLeft;
  }

  public String[] getWordArray() {
    return mWordArray;
  }

  public String generateWordToGuess(String[] array) {
    Random random = new Random();
    int index = random.nextInt(array.length);
    mAnswer = array[index];
    return array[index];
  }

  public String getAnswer() {
    return mAnswer;
  }

  public void addToGuessedArray(String letter) {
    mAlreadyGuessed.add(letter);
  }

  public Boolean isLetterInWord(String letter) {
    if (mAnswer.contains(letter)) {
      return true;
    } else {
      return false;
    }
  }
}
