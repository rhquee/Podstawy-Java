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
import phonebook.PhoneBook;

import java.util.*;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {

        public static void main(String[] args) {
//
//            ArrayList<Integer> integers = new ArrayList<>();
//            integers.add(1);
//            integers.add(2);
//            integers.add(3);
//            int indexFromUser = 3;
//
//            try{
//                System.out.println(integers.get(indexFromUser));
//                //wrazliwy kod
//            }catch (IndexOutOfBoundsException exc /** typ wyjątku nazwa wyjątku, zawsze musi cos tutajj byc, im ogolniejszy typ tym wiecej wyjątków bedzie łapać */){
//                //obsluga wyjątku
//                System.out.println("Index poza zakresem2");
//            }

            int a = 3;
            int b = 0;

            try{
                System.out.println("przed ilorazem");
                int iloraz = a/b;
                System.out.println("po ilorazie");
            }catch(ArithmeticException dzieleniePrzezZero){
                //dzieleniePrzezZero.getMessage();
                dzieleniePrzezZero.printStackTrace();
            }

            }
        }
