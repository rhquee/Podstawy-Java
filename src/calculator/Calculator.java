package calculator;

public class Calculator {

    public static int divide(int a, int b) {
        if (b == 0) {
            //rzuc wyjątek
            throw new DividebyZeroException("second argument is 0!");
        } else {
            return a / b;
        }
    }
}
