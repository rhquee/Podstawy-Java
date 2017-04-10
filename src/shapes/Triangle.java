package shapes;

/**
 * Created by RENT on 2017-04-10.
 */
public class Triangle extends Shape {
    public int a;
    public int h;

    public Triangle() {
        this.a = 4;
        this.h = 6;

//    int a = 5;
//    int h = 6;


    @Override
    public void surfaceArea() {
        int p = (a*h)/2;
        System.out.println("Powierzchnia trójkata: " + p);
    }
}
