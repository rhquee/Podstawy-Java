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
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            integers.add(2);
            integers.add(3);
            int indexFromUser = 5;

            try {
                int iloraz = 10 / indexFromUser;
                integers.get(iloraz);
                Integer.parseInt("jeden");
            //wyjątki musza byc poukładane od najbardziej szczegolowego u góry
            }catch(ArithmeticException exc){
                System.out.println("dzielenie przez 0");
                exc.printStackTrace();
            } catch (IndexOutOfBoundsException exc){
                System.out.println("Index poza zakresem");
            }catch(Exception exc){
                System.out.println("Unknown exception");
            }
            }
            }
