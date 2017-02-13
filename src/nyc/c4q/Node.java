package nyc.c4q;

/**
 * Created by Millochka on 2/5/17.
 */
public class Node {
    Node next;
    Object value;

    public Node(Object data) {
        this.value = data;
        this.next = null ;
    }

    public boolean searchLinkedList(Node head, Object value){

        Node currentNode = head;

        while (currentNode!=null) {

            if (currentNode.value != null) {

                if (currentNode.value.equals(value)) {
                    return true;
                }

            }
            currentNode = currentNode.next;
        }

      return false;
    }

    public boolean recursiveSearchLinkedList(Node head, Object value){



            if (head == null) {
                return false;
            }

                else if (value.equals(head.value)) {
                return true;
            }


                else {

                    return recursiveSearchLinkedList(head.next,value);

            }



    }






}
