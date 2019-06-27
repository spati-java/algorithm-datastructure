public class CustomLinkedList{

    Node head;

    int count = 0;

    void append(int data){
        
        if(head == null){

            head = new Node(data);

            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = new Node(data);

    }

    int size(){

        count = 1;

        if (head == null)
            return 0;

        if(head.next == null){
            return count;
        }
       
        Node current = head;

        while(current.next != null) {
              current = current.next;
              count ++;
            }
                
        return count;
    }

    public static void main(String [] args){

        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.append(5);
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