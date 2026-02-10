public class BubbleSortObjects {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 72),
            new Student("Charlie", 90),
            new Student("Dominic", 78)
        };

        bubbleSort(students);

        for (Student s : students) {
            s.display();
        }
    }
    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].marks > arr[j + 1].marks) {
                    
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " has " + marks + " marks");
    }
}


