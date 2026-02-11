//import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
    }
}

class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLL {
    private Node head;
    private int size;

    public SinglyLL(){
        head = null;
        size = 0;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            
            curr.next = newNode;
        }
    }

    public void remove(int index){
        if (index == 0){
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++){
                curr = curr.next;
            }

            curr.next = curr.next.next;
        }
        size--;
    }
}