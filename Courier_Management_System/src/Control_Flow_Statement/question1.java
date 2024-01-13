package Control_Flow_Statement;

public class question1 {
	public static void main(String[] args) {
        // Example usages
        System.out.println(checkOrderStatus("Delivered"));
        System.out.println(checkOrderStatus("Processing"));
        System.out.println(checkOrderStatus("Cancelled"));
        System.out.println(checkOrderStatus("In Transit")); 
    }

    public static String checkOrderStatus(String status) {
        if (status == null || status.isEmpty()) {
            return "Invalid status";
        }

        if ("Delivered".equals(status)) {
            return "Order has been delivered.";
        }
        else if ("Processing".equals(status)) {
            return "Order is still being processed.";
        } 
        else if ("Cancelled".equals(status)) {
            return "Order has been cancelled.";
        }
        else {
            return "Unknown status";
        }
    }

}
