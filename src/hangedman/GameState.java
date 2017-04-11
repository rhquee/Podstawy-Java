package hangedman;

/**
 * Created by RENT on 2017-04-11.
 */
public class GameState {
    private static final int TRIES = 7;

    private String secretWord;
    private char[] guesses;
    private int tries;

    public GameState(String secretWord) {
        this.secretWord = secretWord;
        guesses = new char[secretWord.length()];
        tries = TRIES;
    }

    public void decrementTries() {
        tries--;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public char[] getGuesses() {
        return guesses;
    }

    public void setGuesses(char[] guesses) {
        this.guesses = guesses;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    @Override
    public String toString() {
        String result = "";
        for (char c : guesses) {
            result += c;
            result += " ";
        }
        result += "\t";
        result += "tries left: ";
        result += tries;
        return result;
    }
}
