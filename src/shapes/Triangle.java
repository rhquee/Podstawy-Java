package shapes;

/**
 * Created by RENT on 2017-04-10.
 */
public class Triangle extends Shape implements HasVertexes {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (a * h) / 2;
    }

    @Override
    public int hasVertexes() {
        return 3;
    }
}

