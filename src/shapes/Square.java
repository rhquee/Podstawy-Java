package shapes;

/**
 * Created by RENT on 2017-04-10.
 */
public class Square extends Shape {
    int a = 5;

    @Override
    public void surfaceArea() {
        int p = a * a;
        System.out.println("Powierzchnia kwadratu: " + p);
    }
}
