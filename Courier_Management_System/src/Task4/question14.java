package Task4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question14 {
	
	private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = UPPER_CASE.toLowerCase();
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+";

    private static final int PASSWORD_LENGTH = 12; // You can adjust this as needed

    public static String generatePassword() {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);

        // Add at least one character of each type
        password.append(UPPER_CASE.charAt(random.nextInt(UPPER_CASE.length())));
        password.append(LOWER_CASE.charAt(random.nextInt(LOWER_CASE.length())));
        password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        // Fill the remaining spots with a random mix of all types
        String allCharacters = UPPER_CASE + LOWER_CASE + NUMBERS + SPECIAL_CHARACTERS;
        for (int i = 4; i < PASSWORD_LENGTH; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle to avoid predictable sequences
        List<Character> chars = new ArrayList<>();
        for (char c : password.toString().toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars);
        StringBuilder finalPassword = new StringBuilder();
        for (char c : chars) {
            finalPassword.append(c);
        }

        return finalPassword.toString();
    }

    public static void main(String[] args) {
        // Generate and print a secure password
        String securePassword = generatePassword();
        System.out.println("Secure Password: " + securePassword);
    }

}
