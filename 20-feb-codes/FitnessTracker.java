import java.util.*;

public class FitnessTracker {
    public static int inputSteps() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter daily steps: ");
        sc.close();
        return sc.nextInt();
        
    }

    public static double calculateCalories(int steps) {
        return steps * 0.04;
    }

    // Overloaded for weight [cite: 213]
    public static double calculateCalories(int steps, double weight) {
        return steps * weight * 0.0005;
    }

    public static void main(String[] args) {
        int steps = 10000; // Example input [cite: 235]
        double weight = 70.0;
        
        long calories = Math.round(calculateCalories(steps, weight));
        
        System.out.println("Total Steps: " + steps);
        System.out.println("Calories Burned: " + calories);
    }
}