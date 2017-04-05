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

public class Main {

        public static void main(String[] args) {
//            Lecturer lecturer = new Lecturer();
//            Date publicationDate = new Date(12, 4, 2016);
//            Publication publicationZero = new Publication("Wstep do Javy0", publicationDate);
//            Publication publicationOne = new Publication("Wstep do Javy1", publicationDate);
//
//            lecturer.addPublication(publicationZero);
//            lecturer.addPublication(0, publicationOne);
//
//            ArrayList<Publication> publications = lecturer.getPublications();
//            Publication fetchedPublication = publications.get(0);
//            for (Publication p : publications) {
//                System.out.println(p.getTitle());
//            }
//
//            Student studentOne = new Student("Name1", new Date(1, 1, 1980), "209999");
//            Dormitory dormitory = new Dormitory();
//            dormitory.addStudent(studentOne);
//            dormitory.printAllStudentsInDormitory();
//
////  System.out.print(fetchedPublication.getTitle());
//            LinkedList<Publication> publicationsLL = new LinkedList<>();
//            MyLinkedList<Student> studentsList = new MyLinkedList<>();
//            Student studentOne = new Student("Rafał", new Date(1,1,1990), "45522");
//            Student studentTwo = new Student("Rafal", new Date(1,1,1990), "11111");
//            Student studentThree = new Student("Maciek", new Date(1,1,1980), "11112");

//            studentsList.add(studentOne);
//            studentsList.add(studentTwo);
//            studentsList.add(studentThree);

//            System.out.println("Students list: ");
//            studentsList.printAllList();
//            studentsList.removeFirst();
//            System.out.println("Students list: ");
//            studentsList.printAllList();

//            System.out.println(studentsList.ifExists(studentOne));
//            System.out.println(studentsList.ifExists(studentThree));

//            HashSet<Student> students = new HashSet<>();
//            students.add(studentOne);
//            students.add(studentTwo);
//            students.add(studentThree);

//            System.out.println("Ilość studentow: " + students.size());
//            System.out.println(students);

            //zadanie z parami - wersja prostsza
//            HashSet<String> couples = new HashSet<>();
//            Scanner scanner = new Scanner(System.in);
//
//            int couplesAmount = scanner.nextInt();
//            scanner.nextLine();
//            if(scanner.hasNextLine()){ //jesli ma nastepna linie, to ja wczyta, a jesli nie to poleci dalej
//
//            }
////coś jest nie tak, bo pokazuje tylko pierwszą z dwóch wpisanych par (ilośc par - 1)
//            for(int i = 0; i < couplesAmount; i++){
//                //scanner.nextLine();
//                String couple = scanner.nextLine();
//                System.out.printf("pair: %s\n", couples);
//                couples.add(couple);
//                System.out.println(couples.size());
//            }

            String nameOne = "Napis Pieprwspzyp";
            String nameTwo = new String ("Napis Drugi");

            //ilosc znaków w napisie, z bialymi znakami
            System.out.println(nameOne.length());
            //litera na miejscu danego indeksu
            System.out.println(nameOne.charAt(2));
            //czy wyrazenie zawiera ""
            System.out.println(nameOne.contains("pis"));
            //na jakim nrze indeksu jest dany char
            System.out.println(nameOne.indexOf("pi"));
            System.out.println(nameOne.lastIndexOf("p"));
            //zostawia to co pomiędzy indeksami
            System.out.println(nameOne.substring(1,3)); //czyli na indeksie 1 i 2 (dlugosc - 1 = 3 - 1)
            //ucina to co przed/za indeksem
            System.out.println(nameOne.substring(3,10));

            System.out.println(nameOne.toLowerCase()); //toUpperCase

            System.out.println(nameOne.startsWith("Nap")); //true
            System.out.println(nameOne.startsWith("nap")); //false

            System.out.println(nameOne.endsWith("zyp")); //true
            System.out.println(nameOne.endsWith("zyp ")); //false

            String stringThree = "   napis       trzy   du   zo   spa   cji";
            System.out.println(stringThree.trim()); //usuwa spacle z lewej i prawej

            System.out.println(stringThree.replaceAll(" ", "")); //usuwa WSZYSTKIE spacje z wyrazenia

            //zaimplementuj metode do usuwania
            // bialych znakow ze srodka stringa
            StringUtils stringUtils = new StringUtils();
            System.out.println(stringUtils.removeSpaces(stringThree.trim()));

            Student student = new Student("Rafał", new Date(1,1,1999), "12222");
            System.out.println(student.greetings());

            double pi = 3.141595;
           // System.out.println(String.format("Pi = %.2f", pi)); //stringi = s, deimale d, double i floaty = f
            System.out.printf("Pi = %.2f\n", pi); //stringi = s, deimale d, double i floaty = f
            //spróbuj z \n i bez \n

            int height = 200;
            System.out.printf("Hajt (int) = %d\n", height);

            boolean isTrue = true;
            System.out.printf("Is true?: %b\n", isTrue);

            int height2 = 200;
            System.out.printf("Hajt (integer) = %d\n", height2);

            char sign = 'a';
            System.out.printf("Sign: %c\n", sign);

            int numerek = Integer.parseInt("123");
            System.out.println(numerek+1);

            String napis = String.valueOf(444.22);
            System.out.println(napis);
        }
    }
