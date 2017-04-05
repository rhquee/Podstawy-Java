package academy;

/**
 * Created by E550 on 2017-04-04.
 */

public class Date {
    private int day;
    private int month;
    private int year;

    public String timeZone;

    public Date(int paramDay, int month, int year) {
        day = paramDay;
        this.month = month;
        this.year = year;
        timeZone = "Greenwitch";
        //System.out.println("Jestem w kons. Date(int,int,int");
    }

    public String printDate() {
        return  day + "." + month + "." + year;
    }

    //dodaj metodę do sprawdzenia czy data w parametrze   jest przed
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}