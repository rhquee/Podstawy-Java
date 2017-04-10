package shapes;

/**
 * Created by RENT on 2017-04-10.
 */
public class Circle extends Shape {
    private double pi = 3.14;
    int r = 5;

    @Override
    public void surfaceArea() {
        double p = pi * (r * r);
        System.out.println("Powierzchnia kola: " + p);
    }
}