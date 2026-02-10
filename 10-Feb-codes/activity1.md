Activity 1: 
Part 1:

Feature                 ArrayList                   LinkedList
Internal Structure      Dynamic Array               Doubly Linked List 
Access Time             O(1)                        O(n) 
Insertion Time          O(n)                        O(1) 
Deletion Time           O(n)                        O(1) 
Memory Usage            Less                        More 




Part 2:
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(85, 92, 78, 88, 95));
        marks.add(2, 90); // Insert 90 at index 2
        marks.remove(Collections.min(marks));
        System.out.println("Final Marks: " + marks);
    }
}


import java.util.*;

public class TicketQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Collections.addAll(queue, "Alice", "Bob", "Charlie", "David", "Eve");
        queue.poll();
        queue.poll();
        System.out.println("Remaining Queue: " + queue);
    }
}



Part 3:
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class SLL {
    Node head;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }
    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}