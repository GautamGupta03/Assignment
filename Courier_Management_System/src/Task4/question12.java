package Task4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class question12 {
	
	// Function to generate the email content
    public static String generateEmail(String customerName, String orderNumber, String deliveryAddress, Date deliveryDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String formattedDate = dateFormat.format(deliveryDate);

        return "Dear " + customerName + ",\n\n" +
               "Thank you for your order!\n\n" +
               "Order Number: " + orderNumber + "\n" +
               "Delivery Address: " + deliveryAddress + "\n" +
               "Expected Delivery Date: " + formattedDate + "\n\n" +
               "We hope you enjoy your purchase. If you have any questions or concerns, please contact us.\n\n" +
               "Best regards,\n" +
               "Your Company Name";
    }

    public static void main(String[] args) {
        // Example data
        String customerName = "John Doe";
        String orderNumber = "123456";
        String deliveryAddress = "123 Elm Street, Springfield, IL";
        Date deliveryDate = new Date(); // using current date for demonstration

        // Generate and print the email
        String emailContent = generateEmail(customerName, orderNumber, deliveryAddress, deliveryDate);
        System.out.println(emailContent);
    }

}
