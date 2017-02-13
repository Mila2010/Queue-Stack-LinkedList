package nyc.c4q;

/**
 * Created by Millochka on 2/11/17.
 */
public class MyStack {


    Node top;
    Node head;

    public void push(Object element){
        Node newNode=new Node(element);
        newNode.next=top;
        top=newNode;


    }

    public Object pop(){
        Node currentNode=top;
        top=top.next;
        currentNode.next=null;
        return currentNode.value;

    }
    public int size(){
        Node currentNode=top;
        int count=0;
        while(currentNode!=null){
         count ++;
        }
     return count;
    }

    public boolean isEmpty() {
        if(top==null){
            return true;
        }
        else {
            return false;
        }

    }
    public Object top(){
        return top.value;

    }

}
