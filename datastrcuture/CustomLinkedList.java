import java.util.*;

public class CustomLinkedList{

    Node head;

    int count = 0;

    void append(int data){
        
        if(head == null){

            head = new Node(data);
            count = 1;

            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = new Node(data);
    }

    void prepaind(int data) {

        Node newHead = new Node(data);

        newHead.next = head;

        head = newHead;
    }

    void deleteWithValue(int data){

        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;

        while(current.next != null){

            if(current.next.data == data){

                current.next = current.next.next;
                return;
            }
            current = current.next;

        }
    }

    void removeDuplicate( int data){

        if (head.next == null){
            return;
        }
        
        HashSet<Node> set = new HashSet<Node>();

        Node current = head;

        while(current.next != null ){
            
            set.add(current);
            current = current.next;            
        }

        for(Node n : set) {

            System.out.println(n.data);
        }

    }

    void deleteDupsWithNoBuffer(int data){

        if(head == null) return;

        Node current = head;

        while(current != null ){

                Node runner = current;

                while(runner.next != null){

                        if(runner.next.data == current.data){

                            runner.next = runner.next.next;

                        }
                        else runner = runner.next;
                       
                }
             current = current.next;
        }
    }

    int size(){

        Node current = head;

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(current != null) {
              list.add(current.data);
              current = current.next;
              
            }
                
        return list.size();
    }

    public static void main(String [] args){

        CustomLinkedList linkedList = new CustomLinkedList();

        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(7);
        linkedList.deleteDupsWithNoBuffer(7);

        System.out.println(linkedList.size());
    }

}

class Node {

    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }

}