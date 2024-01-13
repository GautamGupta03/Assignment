package Control_Flow_Statement;

import java.util.*;

class Courier {
    String id;
    double maxCapacity;
    String location;
    double currentLoad;

    public Courier(String id, double maxCapacity, String location) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.location = location;
        this.currentLoad = 0;
    }

    // Check if the courier can take more load
    boolean canCarry(double weight) {
        return currentLoad + weight <= maxCapacity;
    }

    // Assign a shipment to this courier
    void assignShipment(double weight) {
        currentLoad += weight;
    }
}

class Shipment {
    String id;
    double weight;
    String destination;

    public Shipment(String id, double weight, String destination) {
        this.id = id;
        this.weight = weight;
        this.destination = destination;
    }
}


public class question4 {
	
	 public static void main(String[] args) {
	        // Example couriers and shipments
	        List<Courier> couriers = List.of(
	            new Courier("Courier1", 100.0, "LocationA"),
	            new Courier("Courier2", 150.0, "LocationB"),
	            new Courier("Courier3", 200.0, "LocationA")
	        );

	        List<Shipment> shipments = List.of(
	            new Shipment("Shipment1", 50.0, "LocationA"),
	            new Shipment("Shipment2", 70.0, "LocationB"),
	            new Shipment("Shipment3", 60.0, "LocationA")
	        );

	        assignShipmentsToCouriers(shipments, couriers);
	    }

	    private static void assignShipmentsToCouriers(List<Shipment> shipments, List<Courier> couriers) {
	        for (Shipment shipment : shipments) {
	            boolean assigned = false;
	            for (Courier courier : couriers) {
	                if (courier.location.equals(shipment.destination) && courier.canCarry(shipment.weight)) {
	                    courier.assignShipment(shipment.weight);
	                    System.out.println("Assigned " + shipment.id + " to " + courier.id);
	                    assigned = true;
	                    break;
	                }
	            }
	            if (!assigned) {
	                System.out.println("No available courier for " + shipment.id);
	            }
	        }
	    }

}
