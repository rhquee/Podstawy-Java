package string;

/**
 * Created by RENT on 2017-04-05.
 * Napsz metode, ktora stwierdzi ile jest unikalnych par imion.
 * Jezeli mamy pare (a,b) to para (c,d) jest rowna, jezeli a=c i b =d.
 * Para(a,b) != (b,a)
 * john tom
 * john mary
 * john tom
 * mary anna
 * mary anna
 */
public class Couple {
    //wersja prostsza
//    private String nameOne;
//    private String nameTwo;
//
//    public void setNameOne(String name) {
//        this.nameOne = nameOne;
//    }
//
//    public String getNameOne() {
//        return nameOne;
//    }
//
//    public void setNameTwo(){
//        this.nameTwo = nameTwo;
//    }
//
//    public String getNameTwo(){
//        return nameTwo;
//    }
    //wersja trudniejsza
    private String nameOne;
    private String nameTwo;

    public Couple(String nameOne, String nameTwo) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
    }

    public void setNameOne(String name) {
        this.nameOne = nameOne;
    }

    public String getNameOne() {
        return nameOne;
    }

    public void setNameTwo() {
        this.nameTwo = nameTwo;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Couple)) return false;

        Couple couple = (Couple) o;
        return ((nameOne.equals(couple.nameOne) &&
                nameTwo.equals(couple.nameTwo)) ||
                (nameOne.equals(couple.nameTwo) &&
                        nameTwo.equals(couple.nameOne)));
    }

    @Override
    public int hashCode() {
        return nameOne.hashCode() + nameTwo.hashCode();
    }

}
