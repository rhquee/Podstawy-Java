package phonebook;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by RENT on 2017-04-06.
 * Stworzenie ksiązki telefonicznej.
 * Na poczatku programu podajemy kilka kontaktow( par nazwisko - nr telefonu).
 * Nastepnie program powinien umozliwic pobranie numeru telefonu wg nazwiska (albo fragmentu nazwiska).
 */
public class PhoneBook {
    HashMap<String, Integer> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void readContactFromUser() { //wczytaj kontakt od usera (?)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding new contact - name, then number:");
        String name = scanner.next();
        Integer phoneNumber = scanner.nextInt();
        contacts.put(name, phoneNumber);
        System.out.printf("Added new contact:%s %d\n", name, phoneNumber);

    }

    public Integer findNumber(String name) { //wyszukiwanie wg calego imienia
        return contacts.get(name);
    }

    //wyszukiwanie wg kawalka imienia
    public Integer findByPartialName(String partName) {
        Set<String> names = contacts.keySet();
       // System.out.println(contacts.keySet());
        //foreach:
        //for(Typ nazwaZmiennej : nazwaKolekcji){}
        for (String name : names) {
            //to ponizsze name w ifie jest namem z fora
            if (name.startsWith(partName)) {
                return contacts.get(name);
            }
        }
        return null;
    }

    public void printAllContact() {
        System.out.println(contacts);
    }


    public String findAllByPartialName(String partName) {
        Set<String> names = contacts.keySet();
        HashMap<String, Integer> result = new HashMap<>();
//        System.out.println(contacts.keySet());
        //foreach:
        //for(Typ nazwaZmiennej : nazwaKolekcji){}
        for (String name : names) {
            //to ponizsze name w ifie jest namem z fora
            if (name.startsWith(partName)) {
                result.put(name, contacts.get(name));
            }
        }
        return result.toString();
    }

//    public void printAllContact() {
//        System.out.println(contacts);
//    }
}