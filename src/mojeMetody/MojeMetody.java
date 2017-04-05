package mojeMetody;
// Operacje:
//OK - stwierdzenia czy jakies elementy w tablicy podanej jako parametr sie powtarzaja
//OK zliczenie sumy elementow tablicy
//OK srednia wartosc elementow w tablicy
//zamiana miejscami elementow o podanych indeksach
//wyswietlania wszystkich elementow, elementu o zadanym indeksie
// - podciagi tablicy (dla podanych indeksow)

// operacje przesuniecia(shift) :
//            w prawo:
//                    {1,2,3,4} -> {4,1,2,3}
//                    w lewo:
//                    {1,2,3,4} -> {2,3,4,1}
// * przesuniecie z parametrem (o ile elementow)
//
// - sortowanie( jest kilka algorytmow)
// 'tasowanie' elementow - rozrzucenie w losowej kolejnosci


import java.util.Arrays;

public class MojeMetody {
    private int[] mojaZmienna;

    //konstruktor tablicy
    public MojeMetody(int[] nowaZmienna) {
        this.mojaZmienna = nowaZmienna;
    }

    //metody
    //metoda1: zliczenie sumy elementow tablicy
    public int SumujElementy() {
        int suma = 0;
        for (int i = 0; i < this.mojaZmienna.length; i++) {
            suma = suma + this.mojaZmienna[i];
        }
        return suma;
    }

    //metoda2: średnia
    public double Srednia() {
//        int srednia;
//        srednia = SumujElementy()/mojaZmienna.length;
//        return srednia;
        return SumujElementy() / mojaZmienna.length;
    }

    //metoda3: czy elementy w tablicy się powtarzają
    public boolean Powtarzanie() {
        int[] posortowane = this.mojaZmienna;
        Arrays.sort(posortowane);
        System.out.println(posortowane.length);
        for (int i = 0; i < posortowane.length-1; i++) {
            if (posortowane[i] == posortowane[i + 1]) {
                return true;
            }
        }
        return false;
    }


}
