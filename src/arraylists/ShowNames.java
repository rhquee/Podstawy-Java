package arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by kfrak on 22.03.2018.
 * <p>
 * W pętli pobierz od użytkownika 5 imion. Wykorzystaj do tego listę.
 * Następnie wyświetl w konsoli zapisane imiona na liście.
 */


public class ShowNames {

    static Scanner scanner = new Scanner(System.in); //input stream


    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            names.add(scanner.next());
        }

        System.out.print("Imiona: ");
        for (String name : names) {
            System.out.print(name + "\n");
        }
        System.out.print("\n");


    }
}

