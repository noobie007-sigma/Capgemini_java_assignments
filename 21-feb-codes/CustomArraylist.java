import java.util.*;
public class CustomArraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
        list.add("Eve");
        System.out.println("Elements in the arraylist:" + list);
        list.remove(2);
        System.out.println("Elements in the arraylist after removing 3rd element: " + list);
    }
}
