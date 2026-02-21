import java.util.*;
public class EmployeeSortingSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(201, "John", 50000.0);
        Employee e2 = new Employee(103, "Emma", 75000.0);
        Employee e3 = new Employee(150, "Liam", 62000.0);
        Employee e4 = new Employee(120, "Olivia", 58000.0);
        Employee employees[] = {e1, e2, e3, e4};
        System.out.println("Employees before sorting:");
        for(Employee e : employees) {
           System.out.println(e);
        }
        Arrays.sort(employees);
        System.out.println();
        System.out.println("Employees after sorting:");
        for(Employee e : employees) {
            System.out.println(e);
        }
    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Sallary: " + salary;
    }
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }


}
