public class CircularLinkedList {
    private Node head;
    private Node tail;
    public void insertFirst(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;

    }
    public void insertLast(int value){
        Node newNode = new Node(value);
        Node temp = head;
        while(temp!=tail){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void delete(int value){
        if(head==null){
            return;
        }
        if(head.value==value){
            tail.next = head.next;
            head = head.next;
            return;
        }
        Node temp = head;
        Node temp1 = head.next;
        if(temp1.value==value){
            temp.next = temp1.next;
            return;
        }
        while(temp1!=head){
            temp = temp.next;
            temp1 = temp1.next;
            if(temp1.value==value){
                temp.next = temp1.next;
                return;
            }
        }
    }
    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.print("End");
        System.out.println();
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(41);
        circularLinkedList.insertLast(42);
        circularLinkedList.insertLast(43);
        circularLinkedList.insertLast(44);
        circularLinkedList.display();
        circularLinkedList.delete(43);
        circularLinkedList.display();
        circularLinkedList.delete(41);
        circularLinkedList.display();
    }


}
