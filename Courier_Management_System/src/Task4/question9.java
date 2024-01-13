package Task4;
import java.util.Scanner;

public class question9 {
	
	public static void main(String[] args) {
        // Initialize the 2D array with tracking numbers and their statuses
        String[][] parcels = {
            {"TN001", "Parcel in transit"},
            {"TN002", "Parcel out for delivery"},
            {"TN003", "Parcel delivered"}
        };

        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a tracking number
        System.out.print("Enter the tracking number: ");
        String trackingNumber = scanner.nextLine();

        // Find and display the status of the parcel
        String status = findParcelStatus(trackingNumber, parcels);
        if (status != null) {
            System.out.println("Status: " + status);
        } else {
            System.out.println("Tracking number not found.");
        }

        scanner.close();
    }

    private static String findParcelStatus(String trackingNumber, String[][] parcels) {
        for (String[] parcel : parcels) {
            if (parcel[0].equalsIgnoreCase(trackingNumber)) {
                return parcel[1];
            }
        }
        return null; // Return null if tracking number is not found
    }

}
