package academy;

import academy.Date;

/**
 * Created by RENT on 2017-03-30.
 */
public class Person {
    //pola
    private String name;
    private Date birthday;
    private int height;

    //konstruktory
    public Person() {
        System.out.println("Jestem w kons. Person()");
        this.name = "Unknow";
        birthday = new Date(1, 1, 1900);
        birthday.timeZone = "Greenwitch";
    }

    public Person(String name, Date date) {
        this.name = name;
        this.birthday = date;
        //System.out.println("Jestem w kons. Person(String,age)");
    }

    //metody:
    protected void setHeight(int height){
        System.out.println("Set height");
        this.height = height;
    }

    //takie metody nazywamy geterami
    public String getName() {
        return name;
    }

    //takie metody nazywamy seterami
    public void setName(String name) {
        this.name = name;
    }

    public String greetings() {
        return "Hello, my name is: " + name + " And I was born: " + birthday.printDate();
    }
}