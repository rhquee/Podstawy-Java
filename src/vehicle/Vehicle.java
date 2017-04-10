package vehicle;

/**
 * Created by RENT on 2017-04-10.
 */
public abstract class  Vehicle {
    private String registrationNumber;
    private String engineType;
    private int price;


    public Vehicle() {
    }

    public Vehicle(String number, int price){
        this.registrationNumber = number;
        this.price = price;
    }

    public void scrap(){
        System.out.println("zlomowanie w vehicle");
    }
    public abstract void description();
//    {
//        System.out.println("I am the Vehicle");
//    }

    public int getPrice() {
        return price;
    }
}