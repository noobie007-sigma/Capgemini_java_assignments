public class SafeDivide {
    public static void main(String[] args) {
        // Static Inputs
        int dividend = 9;
        int divisor = 0;

        try {
            int result = dividend / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }
}