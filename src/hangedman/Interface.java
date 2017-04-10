package hangedman;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 *  //interakcja z userem:
 * //pobranie litery (walidacja)
 * //1 znak lub caly wyraz
 * //czy znak nie zostal podany wczesniej
 * //sprawdzenie czy litera wystepuje w slowie
 * //wyswietlenie stanu wyrazu i szans
 */

public class Interface {

    public String readLetterFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz litere?");
        String letter = scanner.next();
        return readLetterFromUser();
    }
    }

