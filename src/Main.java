//import mojeMetody.MojeMetody;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        //tablice (wyniki totka) przekazane jako parametr
//        int[] wynikiPierwszyMarca = {1,2,3,6,4,5,6};
//        int[] wynikiDrugiMarca = {7,8,9,11,12,15};
//        int[] wynikiTrzeciMarca = {20,21,25,30,44,55};
//
//        MojeMetody Totolotek = new MojeMetody(wynikiPierwszyMarca);
//        System.out.println(Totolotek.SumujElementy());
//
//        MojeMetody Totolotek2 = new MojeMetody(wynikiDrugiMarca);
//        System.out.println(Totolotek2.SumujElementy());
//
//        System.out.println(Totolotek.Srednia());
//
//        System.out.println(Totolotek.Powtarzanie());
//
//    }

import academy.Date;
import academy.Student;
import com.sun.org.apache.xpath.internal.SourceTree;
import couple.Couple;
import mojeMetody.StringUtils;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.System.out;

public class Main {

        public static void main(String[] args) {
            //tu sprawdzam tylko czy equals działa
//            Couple couple1 = new Couple("a", "b");
//            Couple couple2 = new Couple("a", "b");
//            System.out.println(couple1.equals(couple2));

            //tu jest zadanie
            HashSet<Couple> couples = new HashSet<>();
            Scanner scanner = new Scanner(System.in);

            int couplesAmount = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < couplesAmount; i++){
                String readedLine = scanner.nextLine();
                String[] splitted = readedLine.split(" ");
                System.out.printf("imie1:%s imie2:%s\n", splitted);

                Couple couple = new Couple(splitted[0], splitted[1]);

                couples.add(couple);
                System.out.println(couples.size());

            }


        }
    }
