package containerClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by kfrak on 18.03.2018.
 */
public class ArrayListAndMap {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        arrayList.add(0, 10);
        arrayList.add(0, 8);
        //arrayList.add(6, 13); //IndexOutOfBoundsException

        for (int i : arrayList) {
            System.out.println(i);
        }

        int x = arrayList.get(0);
        System.out.println(arrayList.get(0));

        arrayList.remove(1);
        System.out.println(arrayList);

        HashMap<Integer, String> people = new HashMap<>();
        people.put(5, "Anna Nowak");
        people.put(7, "Jan Kowalski");
        people.put(9, "Jola Spychola");
        people.put(9, "Jola Spychola2");
        people.put(1500, "Andżejlina Dżoli");

        System.out.println(people); //nadpisane 9=JolaS Spychola2
        System.out.println(people.get(9)); //Jola Spychola2
        System.out.println(people.get(2000)); //null

        ArrayList<String> peopleFromMap = new ArrayList<>(people.values());

        Collections.shuffle(peopleFromMap);

        for (String s : peopleFromMap) {
            System.out.println(s);
        }
    }
}
