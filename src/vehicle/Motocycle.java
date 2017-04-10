package vehicle;

/**
 * Created by RENT on 2017-04-10.
 */
public class Motocycle extends Vehicle {
    public Motocycle() {
        super("Dw1112", 1000);
    }

    @Override
    public void description() {
        System.out.println("I am the Motocycle");
    }
}