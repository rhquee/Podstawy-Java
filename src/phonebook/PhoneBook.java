package phonebook;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 *  Stworzenie ksiązki telefonicznej.
 Na poczatku programu podajemy kilka kontaktow( par nazwisko - nr telefonu).
 Nastepnie program powinien umozliwic pobranie numeru telefonu wg nazwiska (albo fragmentu nazwiska).
 */
public class PhoneBook {
    HashMap<String, Integer> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void readContactFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding new contact - name, then number:");
        String name = scanner.next();
        Integer phoneNumber = scanner.nextInt();
        contacts.put(name, phoneNumber);
        System.out.printf("Added new contact:%s %d\n", name, phoneNumber);

    }

    public Integer findNumber(String name) {
        return 0;
    }

    public void printAllContact() {
    }
}