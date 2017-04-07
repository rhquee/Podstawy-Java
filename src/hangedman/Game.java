package hangedman;

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
    public void startGame() {
        String secretWord = randomSecretWord();
        System.out.printf("%s\n", secretWord);
    }

    private String randomSecretWord(){
        ArrayList<String> words = readFromFile();
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }

    public ArrayList<String> readFromFile() { //do przeniesienia
        ArrayList<String> readList = new ArrayList<>();
        File file = new File(FILE_NAME); //statyczny string z bazą ze słowami lub zdefiniowany: tu u góry FILE_NAME
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                readList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException exc) {
            System.out.println("DB with words not exists?");
        }
        return readList;
    }
}
