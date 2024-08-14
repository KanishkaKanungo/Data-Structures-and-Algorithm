public class CustomQueue {
    protected int[] queue;
    private static final int SIZE = 5;
    int end = 0;
    public CustomQueue() {
        queue = new int[SIZE];
    }
    public CustomQueue(int size){
        queue = new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
            return false;
        }
        queue[end++] = item;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
        }
        for (int i = 1; i <end ; i++) {
            queue[i-1] = queue[i];
        }
        end--;
        return queue[0];
    }

    public boolean isFull(){
        return end== queue.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(queue[i]+" -> ");
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        CustomQueue queue1 = new CustomQueue(3);
        queue1.insert(10);
        queue1.insert(11);
        queue1.insert(12);
        queue1.insert(13);
        queue1.display();
    }
}
