package appHangedman;


import appHangedman.goof.GameState;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static String FILE_NAME = "wyrazy.txt";

    private GameState state;
    private GameView gameView;

    public Game() {
        state = new GameState(randomSecretWord());
        gameView = new GameView();
    }

    public void startGame() {
        boolean playing = true;
        while (state.getTries() > 0 && playing) {
            String charFromUser = gameView.getCharFromUser();
            //if(contains in secret word)
            // change
            //
            //sprawdzenie warunkow wygrania
            gameView.printState(state.toString());
            state.decrementTries();
        }
    }

    private String randomSecretWord() {
        ArrayList<String> words = readFromFile();
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }

    private ArrayList<String> readFromFile() {
        ArrayList<String> readList = new ArrayList<>();
        File file = new File(FILE_NAME);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                readList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Database with words not found");
        }
        return readList;
    }
}