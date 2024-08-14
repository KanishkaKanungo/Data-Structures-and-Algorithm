public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    public boolean push(int item){
        if(isFull()){
            int[] temp = new int[stack.length*2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        return super.push(item);
    }

    public static void main(String[] args) {
        CustomStack stack1 = new DynamicStack(3);
        stack1.push(12);
        stack1.push(13);
        stack1.push(14);
        stack1.push(15);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }

}
