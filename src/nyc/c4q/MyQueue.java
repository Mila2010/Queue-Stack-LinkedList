package nyc.c4q;

/**
 * Created by Millochka on 2/11/17.
 */
public class MyQueue {

     Node head;
    Node tail;

    public MyQueue(Node head, Node tail ){
        this.head=head;
        this.tail=tail;
        head.next=tail;

    }

    public void enqueue(Object element){
        Node newNode= new Node(element);
        Node currentNode=tail;
        currentNode.next=newNode;
        tail=newNode;

    }

    public Object dequeue(){

        Node currentNode = head;
        if(head!=tail){
        head=head.next;
            currentNode.next=null;
            return currentNode.value;
        }
        else {
            head=null;
            return currentNode.value;
        }

    }
    public int size(){
        Node currentNode=head;
        int count=0;

        while (currentNode!=tail){
          count ++;
            currentNode=currentNode.next;
        }
      return count;
    }
    public boolean isEmpty(){

        if (head==null){
            return true;
        }
        return false;

    }

    public Object front() {
        return head.value;

    }


}
