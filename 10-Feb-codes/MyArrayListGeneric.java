class Main {
    public static void main(String[] args) {
        
        MyArrayListGeneric<Integer> list = new MyArrayListGeneric<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("Printing Integer List:");
        list.print();
        
        System.out.println("\nElement at index 4: " + list.get(4));

        
        MyArrayListGeneric<String> stringList = new MyArrayListGeneric<>();
        stringList.add("Hello");
        stringList.add("World");
        
        System.out.println("\nPrinting String List:");
        stringList.print();
    }
}
class MyArrayListGeneric<E> {
    
    private Object[] data; 
    private int size;

    public MyArrayListGeneric() {
        data = new Object[4];
        size = 0;
    }

    public void add(E value) {
        if (size == data.length) {
            resize(); 
        }
        data[size++] = value;
    }

    private void resize() {

        Object[] newData = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void print() {
        for(int i = 0; i < size; i++) { 
            System.out.print(data[i] + " ");
        }
    }

    
    
    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
    
        return (E)data[index];
    }
}