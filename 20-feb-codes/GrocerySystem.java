public class GrocerySystem {
    static String itemName;
    static double itemPrice;
    static int availableQty;

    // No-argument method to set data [cite: 78, 80]
    public static void getItemDetails() {
        itemName = "Rice";
        itemPrice = 50.0; 
        availableQty = 2; 
    }

    public static double calculateTotal(int qty, double price) {
        return qty * price;
    }

    // Default 10% discount [cite: 86, 87]
    public static double applyDiscount(double total) {
        return total - (total * 0.10);
    }

    // Custom discount rate [cite: 90, 91]
    public static double applyDiscount(double total, double discountRate) {
        return total - (total * discountRate / 100);
    }

    public static void main(String[] args) {
        getItemDetails();
        double total = calculateTotal(availableQty, itemPrice);
        double finalAmount = applyDiscount(total, 15.0); // Custom 15% discount [cite: 106]

        System.out.println("Total before discount: " + total); 
        System.out.println("Discount applied: 15%");
        System.out.println("Final amount: " + finalAmount);
    }
}