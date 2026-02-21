import java.io.*;
class Student implements Serializable {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        File file = new File("sample.dat"); 

        Student s1 = new Student(1, "Smith", 76); 
        Student s2 = new Student(2, "Allen", 65); 
        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(s1); 
            oos.writeObject(s2); 
            
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            while (true) { 
                Student student = (Student) ois.readObject();
                System.out.println(student.toString()); 
            }
        } catch (EOFException e) { 
            System.out.println("end of file reached. all objects read");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}