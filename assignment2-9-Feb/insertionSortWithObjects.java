import java.util.Arrays;

public class insertionSortWithObjects {

    static class Student {
        String name;
        int s1, s2, s3;
        Student(String name, int s1, int s2, int s3) {
            this.name = name; this.s1 = s1; this.s2 = s2; this.s3 = s3;
        }

        public String toString() {
            return name + ": " + s1 + "," + s2 + "," + s3 + ".";
        }
    }

    static boolean isLess(Student a, Student b) {
        if (a.s1 != b.s1) return a.s1 < b.s1;
        if (a.s2 != b.s2) return a.s2 < b.s2;
        return a.s3 < b.s3;
    }

    public static void sort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && isLess(arr[j], key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 85, 90, 80),
            new Student("Bob",   85, 88, 95),
            new Student("Charlie", 92, 70, 60),
            new Student("David", 85, 90, 75),
            new Student("Eve",   92, 70, 65)
        };

        System.out.println("Before: " + Arrays.toString(students));
        sort(students);
        System.out.println("After:  " + Arrays.toString(students));
    }
}