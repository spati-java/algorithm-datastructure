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
        linkedList.append(6);
        linkedList.append(7);
        linkedList.deleteWithValue(5);
        System.out.println(linkedList.size());
        System.out.println(linkedList.head.data);
    
    }

}

class Node {

    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }

}