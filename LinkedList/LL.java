public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        size = 0;
    }

    public void insertFirst(int value){
        // insertion at first
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        Node newNode = new Node(value);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
        size++;
        // Using Tail
        /*
        tail.next = newNode;
        tail = newNode;
         */
    }
    public void insertAtPosition(int value, int position){

        if(position==1){
            insertFirst(value);
            return;
        }
        if(position==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<position;i++){
            temp = temp.next;
            //System.out.println(temp.value);

        }
        Node newNode = new Node(value);
        Node node = temp.next;
        temp.next = newNode;
        newNode.next  = node;
        size++;
    }
    public void deleteAtFirst(){
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    public void deleteAtLast(){
       Node temp = head;
       Node temp1 = head.next;
       while(temp1.next!=null){
           temp = temp.next;
           temp1 = temp1.next;
       }
       temp.next = null;
       tail = temp;
       size--;
    }
    public void deleteAtLast2(){
        if(size<=1){
            deleteAtFirst();
            return;
        }
        Node temp = get(size-2);
        temp.next = null;
        tail = temp;
        size--;

    }
    public void deleteAtPosition(int position){
        Node temp = get(position);
        Node temp1 = get(position-1);
        temp1.next = temp.next;
        size--;
    }
    public void deleteAtPosition2(int position){
        Node temp = head;

        for(int i=1;i<position;i++){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = temp1.next;
        size--;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertLast(7);
        list.insertLast(9);
        list.display();
        list.insertAtPosition(8,2);
        list.display();
//        list.deleteAtFirst();
//        list.display();
//        list.deleteAtLast2();
//        list.display();
        list.deleteAtPosition2(2);
        list.display();

    }
}