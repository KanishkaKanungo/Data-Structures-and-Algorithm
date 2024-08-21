import javax.sound.midi.spi.SoundbankReader;
import java.sql.SQLOutput;

public class CircularQueue {
    protected int[] queue;
    private static final int SIZE = 5;
    int end = 0,front=0;
    int size = 0;

    public CircularQueue() {
        queue = new int[SIZE];
    }

    public CircularQueue(int size) {
       queue = new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        queue[end++] = item;
        end = end % queue.length;
        size++;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int a = queue[front];
        front++;
        front = front % queue.length;
        size--;
        return a;
    }
    public boolean isFull(){
        return size== queue.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void display(){
        int i=front;
        do{
            System.out.print(queue[i]+" -> ");
            i++;
            i=i% queue.length;
        }while (i!=end);
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue1 = new CircularQueue(5);
        queue1.insert(10);
        queue1.insert(11);
        queue1.insert(12);
        queue1.insert(13);
        queue1.insert(14);
        queue1.display();
        System.out.println(queue1.remove());
        queue1.insert(15);
        queue1.display();
    }
}
