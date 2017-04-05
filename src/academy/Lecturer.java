package academy;

import java.util.ArrayList;

/**
 * Created by E550 on 2017-04-04.
 */

public class Lecturer extends Person {

    private ArrayList<Publication> publications;

    public Lecturer() {
        publications = new ArrayList<>();
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public void addPublication(int index, Publication publication) {
        publications.add(index, publication);
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    //dodaj metode, ktora dodaje nowa publikacje do Wykladowcy
}