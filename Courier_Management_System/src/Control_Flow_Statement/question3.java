package Control_Flow_Statement;

import java.util.Scanner;

public class question3 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Login System");
	            System.out.println("1. Employee Login");
	            System.out.println("2. Customer Login");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    employeeLogin(scanner);
	                    break;
	                case 2:
	                    customerLogin(scanner);
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }

	    private static void employeeLogin(Scanner scanner) {
	        System.out.print("Enter Employee Email: ");
	        String email = scanner.nextLine();
	        System.out.print("Enter Password: ");
	        String password = scanner.nextLine();

	        // Simulating authentication
	        if ("employee@example.com".equals(email) && "employeePass".equals(password)) {
	            System.out.println("Employee logged in successfully!");
	        } else {
	            System.out.println("Invalid credentials for employee.");
	        }
	    }

	    private static void customerLogin(Scanner scanner) {
	        System.out.print("Enter Customer Email: ");
	        String email = scanner.nextLine();
	        System.out.print("Enter Password: ");
	        String password = scanner.nextLine();

	        // Simulating authentication
	        if ("customer@example.com".equals(email) && "customerPass".equals(password)) {
	            System.out.println("Customer logged in successfully!");
	        } else {
	            System.out.println("Invalid credentials for customer.");
	        }
	    }

}
