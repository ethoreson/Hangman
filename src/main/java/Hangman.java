import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Hangman {
  private String[] mWordArray = {"moor", "room", "moro"};
  private String mAnswer;
  private int mGuessesLeft;
  private ArrayList mAlreadyGuessed = new ArrayList();
  private Boolean mGameOver;
  private int mWinningCount;

  public Hangman() {
    mGuessesLeft = 10;
    mGameOver = false;
  }

  public int getGuessesLeft() {
    return mGuessesLeft;
  }

  public String[] getWordArray() {
    return mWordArray;
  }

  public ArrayList getAlreadyGuessed() {
    return mAlreadyGuessed;
  }

  public Boolean getGameOver() {
    return mGameOver;
  }

  public boolean setGameOver(boolean gameOver){
    mGameOver = gameOver;
    return mGameOver;
  }

  public int getWinningCount() {
    return mWinningCount;
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
    return mAnswer.contains(letter);
  }

  public int countAppearances(String letter) {
    String[] answerArray = mAnswer.split("");
    for (int x = 0; x < mAnswer.length(); x++) {
      if (answerArray[x].equals(letter)) {
        mWinningCount += 1;
      }
    }
    return mWinningCount;
  }

  public Boolean checkIfGameOverWin() {
    if (mWinningCount == mAnswer.length()) {
      mGameOver = true;
    } 
    return mGameOver;
  }


}
