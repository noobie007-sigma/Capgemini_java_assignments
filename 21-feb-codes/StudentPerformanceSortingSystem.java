import java.util.*;
public class StudentPerformanceSortingSystem {
    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "Alice", 85),
            new Student(102, "Bob", 72),
            new Student(103, "Charlie", 90),
            new Student(104, "Diana", 78)
        };
        System.out.println("Students before Sorting: ");
        for(Student s : students) {
            System.out.println(s);
        }
        Arrays.sort(students);
        System.out.println();
        System.out.println("Students after sorting:");
        for(Student s: students) {
            System.out.println(s);
        }

    }
}
class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private double marks;
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
    @Override
    public String toString() {
        return "Roll No.: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
    @Override
    public int compareTo(Student s) {
        return this.marks > s.marks ? 1 : this.marks < s.marks ? -1 : 0;
    }
}