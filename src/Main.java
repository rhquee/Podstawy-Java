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

import academy.*;
import mojeMetody.MyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

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
            MyLinkedList<Student> studentsList = new MyLinkedList<>();
            Student studentOne = new Student("Rafał", new Date(1,1,1990), "45522");
            Student studentTwo = new Student("Tomek", new Date(1,1,1990), "11111");
            Student studentThree = new Student("Maciek", new Date(1,1,1980), "11112");

            studentsList.add(studentOne);
            studentsList.add(studentTwo);
            studentsList.add(studentThree);

            System.out.println("Students list: ");
            studentsList.printAllList();

            studentsList.removeFirst();

            System.out.println("Students list: ");
            studentsList.printAllList();


//            System.out.println(studentsList.ifExists(studentOne));
//            System.out.println(studentsList.ifExists(studentThree));
        }
    }
