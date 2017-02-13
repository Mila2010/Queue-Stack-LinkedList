package nyc.c4q;

public class Main {

    public static void main(String[] args) {

        Node list = new Node("Apple");
        list.next = new Node("Orange");
        list.next.next = new Node("Banana");
        list.next.next.next = new Node("Carrot");
        list.next.next.next.next = new Node("Beet");

        list.searchLinkedList(list, "Apple"); // returns true
        list.searchLinkedList(list, "Pear"); // returns false

    }
}
