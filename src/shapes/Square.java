package shapes;

/**
 * Created by RENT on 2017-04-10.
 */
public class Square extends Shape {
    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
