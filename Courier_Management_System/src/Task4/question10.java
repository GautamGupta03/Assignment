package Task4;

import java.util.regex.Pattern;

public class question10 {
	
	 // Validates customer information based on the type of detail
    public static boolean validate(String data, String detail) {
        switch (detail.toLowerCase()) {
            case "name":
                return validateName(data);
            case "address":
                return validateAddress(data);
            case "phone number":
                return validatePhoneNumber(data);
            default:
                System.out.println("Invalid detail type");
                return false;
        }
    }

    private static boolean validateName(String name) {
        // Name should only contain letters and be properly capitalized
        String nameRegex = "([A-Z][a-z]*)([\\s][A-Z][a-z]*)*";
        return Pattern.matches(nameRegex, name);
    }

    private static boolean validateAddress(String address) {
        // Address should not contain special characters
        String addressRegex = "^[a-zA-Z0-9\\s,.-]+$";
        return Pattern.matches(addressRegex, address);
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        // Phone number should follow the format ###-###-####
        String phoneRegex = "\\d{3}-\\d{3}-\\d{4}";
        return Pattern.matches(phoneRegex, phoneNumber);
    }

    public static void main(String[] args) {
        // Test the function
        System.out.println(validate("John Doe", "name")); // true
        System.out.println(validate("123 Main St.", "address")); // true
        System.out.println(validate("123-456-7890", "phone number")); // true
        System.out.println(validate("John_Doe", "name")); // false
        System.out.println(validate("123 Main St. #", "address")); // false
        System.out.println(validate("1234567890", "phone number")); // false
    }

}
