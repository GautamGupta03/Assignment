package Control_Flow_Statement;

public class question2 {
	
	public static void main(String[] args) {
        // Example usage
        System.out.println(getParcelCategory(0.5)); // Light
        System.out.println(getParcelCategory(5));   // Medium
        System.out.println(getParcelCategory(15));  // Heavy
    }

    public static String getParcelCategory(double weight) {
        int category;

        if (weight <= 1) {
            category = 1; // Light
        } else if (weight <= 10) {
            category = 2; // Medium
        } else {
            category = 3; // Heavy
        }

        switch (category) {
            case 1:
                return "Light";
            case 2:
                return "Medium";
            case 3:
                return "Heavy";
            default:
                return "Unknown category";
        }
    }

}
