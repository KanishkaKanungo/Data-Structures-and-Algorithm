import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(12);
//        stack.push(13);
//        stack.push(14);
//        stack.push(15);
//        stack.push(16);
//        stack.push(17);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(18);
        queue.add(19);
        queue.add(20);
        System.out.println(queue.remove());

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(12);
        deque.addLast(15);
        deque.add(13);
        deque.add(14);// add is same as addlast
        System.out.println(deque);


    }
}
