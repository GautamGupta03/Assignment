package Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question15 {

	// Method to find similar addresses
    public static List<String[]> findSimilarAddresses(String[][] addresses) {
        List<String[]> similarAddresses = new ArrayList<>();

        for (int i = 0; i < addresses.length; i++) {
            for (int j = i + 1; j < addresses.length; j++) {
                if (isSimilar(addresses[i], addresses[j])) {
                    similarAddresses.add(new String[]{Arrays.toString(addresses[i]), Arrays.toString(addresses[j])});
                }
            }
        }

        return similarAddresses;
    }

    // Method to check if two addresses are similar
    private static boolean isSimilar(String[] address1, String[] address2) {
        int similarityCount = 0;

        for (int i = 0; i < address1.length; i++) {
            if (address1[i].equalsIgnoreCase(address2[i])) {
                similarityCount++;
            }
        }

        // Define a threshold for considering addresses as similar
        int similarityThreshold = address1.length / 2; // Example threshold

        return similarityCount >= similarityThreshold;
    }

    public static void main(String[] args) {
        String[][] addresses = {
            {"123 Main St", "Springfield", "IL", "62701"},
            {"124 Main St", "Springfield", "IL", "62701"},
            {"500 Park Ave", "New York", "NY", "10022"},
            {"123 Main Street", "Springfield", "IL", "62701"},
            {"500 Park Avenue", "New York", "NY", "10022"}
        };

        List<String[]> similar = findSimilarAddresses(addresses);

        for (String[] pair : similar) {
            System.out.println("Similar Addresses: " + Arrays.toString(pair));
        }
    }
}
