package couple;

/**
 * Created by RENT on 2017-04-05.
 *  Napsz metode, ktora stwierdzi ile jest unikalnych par imion.
 Jezeli mamy pare (a,b) to para (c,d) jest rowna, jezeli a=c i b =d.
 Para(a,b) != (b,a)
 john tom
 john mary
 john tom
 mary anna
 mary anna
 */
public class Couple {
    private String nameOne;
    private String nameTwo;

    public void setNameOne(String name) {
        this.nameOne = nameOne;
    }

    public String getNameOne() {
        return nameOne;
    }

    public void setNameTwo(){
        this.nameTwo = nameTwo;
    }

    public String getNameTwo(){
        return nameTwo;
    }
}