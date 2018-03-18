package appHangedman.goof;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 * //wczytac plik
 * //wylosowac slowo (= z arraylisty?)
 * //interakcja z userem:
 * //pobranie litery (walidacja)
 * //1 znak lub caly wyraz
 * //czy znak nie zostal podany wczesniej
 * //sprawdzenie czy litera wystepuje w slowie
 * //wyswietlenie stanu wyrazu i szans
 */

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









//Main:
//        Game hangedman = new Game();
//        hangedman.startGame();
//        hangedman.makeSecret();
//        hangedman.readLetterFromUser();

//public class Game {
//
//
//    private String secretWord;
//    private String maskedWord = "";
//    private GameState state;
//    private GameView gameView;
//
//
//
//
//    public void startGame() {
//        state = new GameState();
//        //gameview jest zmienna metody.
//        gameView = new GameView();
//
//        System.out.printf("%s\n", randomSecretWord());
//        state.setTries(TRIES);
//        boolean playing = true;
//        while(state.getTries()>0 && playing){
//
//        }
//    }
//
//    private String randomSecretWord() {
//        ArrayList<String> words = readFromFile();
//        Random random = new Random();
//        int index = random.nextInt(words.size());
//        return words.get(index);
//    }
//
//    public ArrayList<String> readFromFile() { //do przeniesienia
//        ArrayList<String> readList = new ArrayList<>();
//        File file = new File(FILE_NAME); //statyczny string z bazą ze słowami lub zdefiniowany: tu u góry FILE_NAME
//        try {
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                readList.add(scanner.nextLine());
//            }
//        } catch (FileNotFoundException exc) {
//            System.out.println("DB with words not exists?");
//        }
//        return readList;
//    }
//
//    public String makeSecret() {
//        for (int i = 0; i < secretWord.length(); i++) {
//            maskedWord = maskedWord + "_";
//        }
//        System.out.println(maskedWord);
//        return maskedWord;
//    }
//
//    public String readLetterFromUser() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zgadnij litere?");
//        String letter = scanner.nextLine();
//
//        if (checkIfLetterExist(letter)) {
//            ShowGuessed(letter.charAt(0));
//        } else {
//            //zmniejsz liczbę żyć o 1
//        }
//
//        //jezeli odgadl przerwij
//        return readLetterFromUser(); //
//    }
//
//    public Boolean checkIfLetterExist(String letterForCeck) {
//        return secretWord.toLowerCase().contains(letterForCeck.toLowerCase());
//    }
//
//    public String ShowGuessed(char literkaDoOdkrycia) {
//        StringBuilder sb = new StringBuilder(maskedWord);
//        for (int i = 0; i < secretWord.length(); i++) {
//            if ("_".charAt(0) == maskedWord.charAt(i) && literkaDoOdkrycia == secretWord.charAt(i)) {
//                sb.setCharAt(i, literkaDoOdkrycia);
//            } else {
//                sb.setCharAt(i, maskedWord.charAt(i));
//            }
//        }
//        maskedWord = sb.toString();
//        System.out.println(maskedWord);
//        return maskedWord;
//    }
//}

