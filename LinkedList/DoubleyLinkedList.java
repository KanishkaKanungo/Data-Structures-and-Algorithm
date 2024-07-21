public class DoublyLinkedLIst {
    private Node head;
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.previous = null;
        if(head!=null) { // can cause null pointer exception if list is empty or there is no node in the list
            // we cannot refer to something that is empty or if not exist
            // //however we can assign empty or null to something
            head.previous = newNode;
        }
        head = newNode;
    }
    public void insertLast(int value){
        Node newNode = new Node(value);
        if(head==null){
            newNode.previous = null;
            newNode = head;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.previous = temp;

    }
    public void insertAtPosition(int value, int position){
        Node temp = head;
        Node newNode = new Node(value);
        for (int i = 1; i <position ; i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = newNode;
        newNode.next = temp1;
        newNode.next.previous = temp;
       // newNode.previous = temp;
        temp1.previous = newNode;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }
    public void displayRev(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.previous;
        }
        System.out.print("First");
        System.out.println();
    }

    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedLIst linkedList = new DoublyLinkedLIst();
        linkedList.insertFirst(82);
        linkedList.insertLast(83);
        linkedList.insertLast(84);
        linkedList.insertLast(86);
        linkedList.insertLast(87);
        linkedList.insertLast(88);
        linkedList.display();
        linkedList.insertAtPosition(85,3);
        linkedList.display();
        linkedList.displayRev();
    }
}
