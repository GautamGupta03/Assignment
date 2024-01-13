package Task4;

public class question13 {
	
	// Constants for cost calculation
    private static final double COST_PER_KILOMETER = 0.50; // example rate per kilometer
    private static final double COST_PER_KILOGRAM = 2.00;  // example rate per kilogram

    // Function to calculate shipping cost
    public static double calculateShippingCost(String sourceAddress, String destinationAddress, double weight, double distance) {
        double costByWeight = weight * COST_PER_KILOGRAM;
        double costByDistance = distance * COST_PER_KILOMETER;
        return costByWeight + costByDistance;
    }

    public static void main(String[] args) {
        // Example data
        String sourceAddress = "123 Elm Street, Springfield";
        String destinationAddress = "456 Maple Avenue, Shelbyville";
        double weight = 10; // in kilograms
        double distance = 100; // in kilometers

        // Calculate and print the shipping cost
        double shippingCost = calculateShippingCost(sourceAddress, destinationAddress, weight, distance);
        System.out.println("The shipping cost is: $" + shippingCost);
    }

}
