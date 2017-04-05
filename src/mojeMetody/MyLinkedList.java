package mojeMetody;

/**
 * Created by E550 on 2017-04-04.
 * Zaimplementuj własną kolekcje - liste łączoną jednokierunkową
 * Metody, jakie powinna udostępniać kolekcja:
 * -dodawanie elementu
 * -wypisywanie wszystkich elementów
 * -usuwanie elementów
 * -pobranie elementu o danym indeksie
 */
public class MyLinkedList<T> {
    private Node head; //przód (pierwszy element) = head, tył (ostatni) = tail

    //dodawanie elementów
    public void add(T data) {
        Node<T> node = new Node<>(null, data);
        node.setNext(head);
        node.setData(data);
        head = node;
//        head = new Node(); //pierwszy element wskazuje na węzeł Node
//        head.setData(data);

//        Node node = new Node(null, data)
    }

    //wypisywanie wszystkich elementów
    public void printAllList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }
    }

    //stwierdzenie czy dany element itnieje (t/f)
    public boolean ifExists(T param) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(param)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    //usuwanie ostatniego elementu ?????
    // trzeba to poprawic:
//    public void removeLast() {
//        if (head != null) {
//            Node currentNode = head;
//            do {
//                currentNode = currentNode.getNext();
//            } while (currentNode.getNext() != null);
//            currentNode.setNext(null);
//        }
//    }


    //uuswanie pierwszego elementu
    public void removeFirst() {
        if (head != null) {  //czy lista jest niepusta
            head = head.getNext();
        } else {
            System.out.println("pusta lista");
        }
    }

//pobieranie elementu o danym indeksie

}


