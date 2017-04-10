package vehicle;

/**
 * Created by RENT on 2017-04-10.
 */
public class Car extends Vehicle {
    public int wheels;

    public Car() {
        super("Dw 112dd", 2000);
        this.wheels = 4;
    }

    public void description(){
        System.out.println("I am the Car");
    }
}