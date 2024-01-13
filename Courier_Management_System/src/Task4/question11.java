package Task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question11 {
	
	 // Function to format an address
    public static String formatAddress(String street, String city, String state, String zipCode) {
        return capitalizeWords(street) + ", " + capitalizeWords(city) + ", " + 
               capitalizeWords(state) + " " + formatZipCode(zipCode);
    }

    // Capitalizes the first letter of each word in a string
    private static String capitalizeWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Formats the zip code to ensure it is in standard format
    private static String formatZipCode(String zipCode) {
        Pattern pattern = Pattern.compile("^\\d{5}(?:-\\d{4})?$");
        Matcher matcher = pattern.matcher(zipCode);
        if (matcher.matches()) {
            return zipCode; // Return as is if already in standard format
        } else {
            // Handle different formatting logic as needed
            return "Invalid Zip"; // Placeholder for invalid zip codes
        }
    }

    public static void main(String[] args) {
        // Test the function
        String formattedAddress = formatAddress("123 elm street", "Springfield", "IL", "62704-1234");
        System.out.println(formattedAddress);
    }

}
