public class BubbleSortStudents {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Alice",  new int[]{80, 70, 60}),
            new Student("Bob",  new int[]{80, 70, 55}),
            new Student("Charlie",  new int[]{75, 90, 85}),
            new Student("David", new int[]{80, 70, 90}),
            new Student("Eve",  new int[]{75, 60, 70})
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

        
        for (int i = 0; i < s1.subjects.length; i++) {
            if (s1.subjects[i] > s2.subjects[i]) return true;
            if (s1.subjects[i] < s2.subjects[i]) return false;
        }

        return false;
    }
}
class Student {
    String name;
    int[] subjects; 

    Student(String name, int[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    void display() {
        System.out.println(
            name +
            " | " + subjects[0] +
            " " + subjects[1] +
            " " + subjects[2]
        );
    }
}