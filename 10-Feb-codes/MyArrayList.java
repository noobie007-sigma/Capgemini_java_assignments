class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.print();
        
        
        System.out.println("index: " + list.get(40)); 
    }
}

class MyArrayList {
    private int[] data;
    private int size;

    public MyArrayList() {
        data = new int[4];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        
        data[size++] = value;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        
        data = newData;
    }

    public void print() {
        
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public int get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
        return data[index];
    }
}