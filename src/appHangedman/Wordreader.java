package appHangedman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Lenovo on 2018-03-01.
 */
public class Wordreader {

    private String word = "wyrazy.txt";
    private String s;

    public Wordreader() {
        printWordsFromFile();
        this.word = word;
        System.out.println(word);
    }

    private String printWordsFromFile() {
        File file = new File(word);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                s = scanner.nextLine();
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Database with words not found");
        }
        return s;


    }
}
