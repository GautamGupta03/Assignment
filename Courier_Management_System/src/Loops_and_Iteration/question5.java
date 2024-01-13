package Loops_and_Iteration;

import java.util.ArrayList;
import java.util.List;

class Customer {
    int customerId;
    String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}

class Order {
    int orderId;
    int customerId;
    String orderDetails;

    public Order(int orderId, int customerId, String orderDetails) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDetails = orderDetails;
    }
}

public class question5 {
	
	public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 101, "Order 1 Details"));
        orders.add(new Order(2, 102, "Order 2 Details"));
        orders.add(new Order(3, 101, "Order 3 Details"));
        orders.add(new Order(4, 103, "Order 4 Details"));
        orders.add(new Order(5, 101, "Order 5 Details"));

        int specificCustomerId = 101;
        displayOrdersForCustomer(orders, specificCustomerId);
    }

    private static void displayOrdersForCustomer(List<Order> orders, int customerId) {
        System.out.println("Orders for Customer ID: " + customerId);
        for (Order order : orders) {
            if (order.customerId == customerId) {
                System.out.println("Order ID: " + order.orderId + ", Details: " + order.orderDetails);
            }
        }
    }

}
