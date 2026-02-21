public class TravelEstimator {
    public static void getTravelDetails() {
        System.out.println("Trip: Distance 250km, Mileage 12km/l, Price 105, Toll 80");
    }

    // Fuel only 
    public static double calculateCost(double dist, double mil, double price) {
        return (dist / mil) * price;
    }

    // Fuel + Toll [cite: 148, 150]
    public static double calculateCost(double dist, double mil, double price, double toll) {
        return ((dist / mil) * price) + toll;
    }

    public static void main(String[] args) {
        double dist = 250, mil = 12, price = 105, toll = 80;
        
        double fuelCost = Math.ceil(calculateCost(dist, mil, price));
        double totalCost = Math.ceil(calculateCost(dist, mil, price, toll));

        System.out.println("Fuel Cost: " + (int)fuelCost + " ₹");
        System.out.println("Total Cost (including toll): " + (int)totalCost + " ₹");
    }
}