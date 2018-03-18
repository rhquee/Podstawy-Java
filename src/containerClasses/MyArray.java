package containerClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by E550 on 2017-04-04.
 * <p>
 * <p>
 * Operacje na tablicy:
 * - stwierdzenia czy jakies elementy w tablicy podanej jako parametr sie powtarzaja
 * - zliczenie sumy elementow tablicy
 * - srednia wartosc elementow w tablicy
 * - zamiana miejscami elementow o podanych indeksach
 * - wyswietlania wszystkich elementow, elementu o zadanym indeksie
 * - podciagi tablicy (dla podanych indeksow)
 * <p>
 * operacje przesuniecia(shift):
 * w prawo:
 * {1,2,3,4} -> {4,1,2,3}
 * <p>
 * w lewo:
 * {1,2,3,4} -> {2,3,4,1}
 *
 * - przesuniecie z parametrem (o ile elementow)
 * - sortowanie( jest kilka algorytmow)
 * - 'tasowanie' elementow - rozrzucenie w losowej kolejnosci
 */
public class MyArray {
    private int[] mojaTablica;

    //konstruktor tablicy
    public MyArray(int[] mojaTablica) {
        this.mojaTablica = mojaTablica;
    }

    //metody
    //metoda1: zliczenie sumy elementow tablicy
    public int SumujElementy() {
        int suma = 0;
        for (int i = 0; i < this.mojaTablica.length; i++) {
            suma = suma + this.mojaTablica[i];
        }
        return suma;
    }

    //metoda2: średnia
    public double Srednia() {
//        int srednia;
//        srednia = SumujElementy()/mojaTablica.length;
//        return srednia;
        return SumujElementy() / mojaTablica.length;
    }

    //metoda3: czy elementy w tablicy się powtarzają
    public boolean Powtarzanie() {
        int[] posortowane = this.mojaTablica;
        Arrays.sort(posortowane);
        System.out.println(posortowane.length);
        for (int i = 0; i < posortowane.length - 1; i++) {
            if (posortowane[i] == posortowane[i + 1]) {
                return true;
            }
        }
        return false;
    }

//    //dodawanie grup elementów
//    Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3));
//    Integer[] more = {4,5};
//    collection.addAll(Arrays.asList(more));



}
