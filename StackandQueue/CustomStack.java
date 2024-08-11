
public class CustomStack {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.stack = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }
        ptr++;
        stack[ptr] = item;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int removed = stack[ptr];
        ptr--;
        return removed;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public boolean isFull(){
        return ptr== stack.length-1;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return stack[ptr];
    }

    public static void main(String[] args) {
        CustomStack stack1 = new CustomStack(5);
        stack1.push(10);
        stack1.push(11);
        stack1.push(12);
        stack1.pop();
        System.out.println(stack1.peek());
    }
}