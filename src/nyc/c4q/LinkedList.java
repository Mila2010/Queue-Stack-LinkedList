package nyc.c4q;

/**
 * Created by Millochka on 2/11/17.
 */
public class LinkedList {

    Node head;
    //int length;

    public void add(int index, Object element){

        Node currentNode=head;

        Node newNode= new Node(element);
        int currentindex=0;

        if(this.size()<index){

            System.out.print("Index id out of range");
        }
        else if(this.size()==index){

            while (currentNode.next!=null){


                currentNode=currentNode.next;


            }

            currentNode.next=newNode;

        }
        else {
            Node previousNode=head;
            currentNode=head;
            while (currentindex < index) {
                previousNode=currentNode;
                currentNode = currentNode.next;
                currentindex++;

            }
          previousNode.next=newNode;
            newNode.next=currentNode;

        }


    }


    public Object get(int index) {
        int currentindex=0;
        Node currentNode=head;
        while (currentindex != index) {

            currentNode = currentNode.next;
            currentindex++;

        }
        return currentNode.value;
    }


    public Object remove(int index) {

                int currentindex=0;
                Node currentNode=head;
                Node previousNode=head;
                while (currentindex<index){

                    previousNode=currentNode;
                    currentNode=currentNode.next;
                    currentindex++;

                }
             previousNode.next=currentNode.next;

             return currentNode.value;
            }

    public int size() {

        int count=0;
        Node currentNode= head;
        while (currentNode.next!=null){
            count++;
        }
     return count;
    }

    public boolean isEmpty() {
        if (head==null){
            return true;
        }
        return false;

    }


}
