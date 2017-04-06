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
import mojeMetody.StringUtils;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

        public static void main(String[] args) {
            //set przechowuje elementy unikalne
            //hash set nie gwarantuje kolejnosci
            HashSet<Integer> set = new HashSet<>();
            set.add(1);
            set.add(1);
            set.add(5);
            set.add(30);
            set.add(200);
            System.out.println(set);

            //treeSet przchowuje elementy posortowane
            TreeSet<Integer> set2 = new TreeSet<>();
            set2.add(1);
            set2.add(1);
            set2.add(5);
            set2.add(200);
            set2.add(220);
            System.out.println(set2);
        }
    }
