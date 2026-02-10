public class BubbleSortObjectsWithComparator {
    public static void main(String[] args) {

        Student[] students = {
            new Student("Alice", 80, 70, 60),
            new Student("Bob", 80, 70, 55),
            new Student("Charlie", 75, 90, 85),
            new Student("David", 80, 70, 90),
            new Student("John", 75, 60, 70)
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

                if (shouldSwap(arr[j], arr[j + 1])) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static boolean shouldSwap(Student s1, Student s2) {        
        if (s1.fsd > s2.java) return true;
        if (s1.fsd < s2.java) return false;

        
        if (s1.java > s2.cpp) return true;
        if (s1.java < s2.cpp) return false;

        
        return s1.cpp > s2.cpp;
    }
}


class Student {
    String name;
    int fsd;
    int java;
    int cpp;

    Student(String name, int fsd, int java, int cpp) {
        this.name = name;
        this.fsd = fsd;
        this.java = java;
        this.cpp = cpp;
    }

    void display() {
        System.out.println(
            "Name: " + name + 
            " FSD: " + fsd +
            " Java: " + java +
            " CPP: " + cpp
        );
    }
}