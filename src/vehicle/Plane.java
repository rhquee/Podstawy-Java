package vehicle;

/**
 * Created by RENT on 2017-04-10.
 */
public  class Plane extends Vehicle implements Passengers {
    @Override
    public void description() {
        System.out.println("I am plane");
    }

    @Override
    public int amountOfPassengers() {
        return 30;
    }
}