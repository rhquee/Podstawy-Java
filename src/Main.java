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
import hangedman.Game;
import mojeMetody.Calculator;
import mojeMetody.DivideByZeroException;
import mojeMetody.StringUtils;
import phonebook.PhoneBook;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;
import vehicle.*;

import java.util.*;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {

    public static void printDescription(Vehicle v) {
        v.description();
    }


    public static void main(String[] args) {
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.description();
//        Car car1 = new Car();
//        car1.description();

//        Vehicle vehicle1 = new Car();
//        vehicle1.description();

//        printDescription(new Car());
//        printDescription(new Motocycle());
//        printDescription(new Ship());

//        Car car2 = (Car) new Vehicle(); //bez tego w nawiasie nie jest możliwe takie wskazanie
//        car2.description();

//        Vehicle car1 = new Car();
//        Car car2 = (Car) car1;
//       // car1.wheels; //brak dostepu, musiałoby być ((Car) car1).wheels
//        car1.description();
//
//        ArrayList<Vehicle> list = new ArrayList<>();
//        list.add(new Car());
//        list.add(new Motocycle());
//        list.add(new Ship());
//        int sum = 0;
//        for (Vehicle v : list) {
//            sum += v.getPrice();
//        }
//        System.out.println(sum);
//    //////
//
//        printDescription(new Car());
//        printDescription(new Motocycle());
//        printDescription(new Ship());
//        printDescription(new Plane());


            Shape circle = new Circle(5.0);
            Shape rectangle = new Square(2, 5);
            Shape triangle = new Triangle(3.0, 4.0);
            System.out.printf("%f\n%f\n%f\n",
                    circle.calculateArea(),
                    rectangle.calculateArea(),
                    triangle.calculateArea());
        }
    }
