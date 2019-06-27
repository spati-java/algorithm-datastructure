public class CustomQueue {

    int maxSize = 0;
    int front =  1;
    int rear = -1;
    int count = 0;
    String[] array;

    public CustomQueue(int capacity) {
        maxSize = capacity;
        this.start = -1;
        this.array = new String[maxSize];
    }

    public void enque(String word) {
        array[++start] = word;
        count++;
    }

    public String deque() {
        if(count == 0){
            return null;
        }
        return array[count];
    }

    public int size(){
        return count;
    }

    public static void main(String [] args){

        CustomQueue q = new CustomQueue(5);
         q.enque("Hello");
         q.enque("World");
    }



}