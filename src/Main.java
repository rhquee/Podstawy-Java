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
import academy.StudentState;
import polimorfismVehicle.Vehicle;

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


//        Shape circle = new Circle(5.0);
//        Shape square = new Square(2, 5);
//        Shape triangle = new Triangle(3.0, 4.0);
//        System.out.printf("%f\n%f\n%f\n",
//                circle.calculateArea(),
//                square.calculateArea(),
//                triangle.calculateArea());

//        HasVertexes triangle2 = new Triangle(3, 4);
//        System.out.printf("%d\n", triangle2.hasVertexes());

//        Passengers car1 = new Car();
//        Passengers plane1 = new Plane();
//        Passengers ship1 = new Ship();
//        System.out.printf("W samochodzie miesci sie %d ludzi,\nw samolocie miesci sie %d ludzi,\na w statku az %d\n",
//                car1.amountOfPassengers(),
//                plane1.amountOfPassengers(),
//                ship1.amountOfPassengers());
//
//        List<Integer> list = new ArrayList<>(); //zamiast arrylist przed =
//        List<Integer> linkedList = new LinkedList<>(); //zamiast linkedList przed =
//        linkedList.size(); //zaimplementowane dla "list"

            //StudentState.ACTIVE;
            Student s = new Student("Ania", new Date(1,2,1990), "8888", StudentState.ACTIVE);
            StudentState studentState = s.getStudentState();
            System.out.println(studentState);

            System.out.println(studentState.ACTIVE.hasRoghtForStipend); //czemu "false"? bo nie byl przypisany has... = b w konstruktorze
            System.out.println(studentState.SUSSPEND.hasRoghtForStipend);

            StudentState.ACTIVE.translated = "aaaa"; //moge zmienic tu nazwe enuma publiczbego, dlatego lepiej zeby byl prywatny
            StudentState[] values = StudentState.values();
            for(StudentState state : values){
                System.out.println(state.translated);
            }
        }
    }
