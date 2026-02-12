class Node {
    String key;
    int value;
    Node next;
    
    Node(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyHashMap {
    private Node[] table;
    private int size;

    public MyHashMap(int capacity) {
        table = new Node[capacity];
        size = capacity;
    }
    //replacement for hashcode
    public int hash(String key) {
        int hash = 0;
        for(int i = 0; i < key.length(); i++) {
            hash = hash + key.charAt(i);
        }
        return hash % size;
    }
}