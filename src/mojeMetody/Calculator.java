package mojeMetody;

/**
 * Created by RENT on 2017-04-07.
 */
public class Calculator {
    public static int divide(int a, int b){
        if(b ==0) {
            //rzuc wyjątek
            throw new DivideByZeroException("second argument is 0");
        }else{
            return a/b;
        }
    }
}
