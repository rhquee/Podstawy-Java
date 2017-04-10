package vehicle;

/**
 * Created by RENT on 2017-04-10.
 */
public class Ship extends Vehicle {
    public Ship() {
        super("dw103", 30000);
    }

    public void description() {
        System.out.println("I am the Ship");
    }
}