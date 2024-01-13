package Arrays_and_DSA;

class GeoPoint {
    double latitude, longitude;

    public GeoPoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Calculate the distance to another GeoPoint
    public double distanceTo(GeoPoint other) {
        return Math.sqrt(Math.pow(this.latitude - other.latitude, 2) + Math.pow(this.longitude - other.longitude, 2));
    }
}


class DeliveryAgent {
    String name;
    GeoPoint currentLocation;
    boolean isAvailable;

    public DeliveryAgent(String name, GeoPoint currentLocation, boolean isAvailable) {
        this.name = name;
        this.currentLocation = currentLocation;
        this.isAvailable = isAvailable;
    }
}


class DeliveryAgentService {

    private DeliveryAgent[] agents;

    public DeliveryAgentService(DeliveryAgent[] agents) {
        this.agents = agents;
    }

    public DeliveryAgent findNearestAvailableAgent(GeoPoint orderLocation) {
        DeliveryAgent nearestAgent = null;
        double shortestDistance = Double.MAX_VALUE;

        for (DeliveryAgent agent : agents) {
            if (agent.isAvailable) {
                double distance = agent.currentLocation.distanceTo(orderLocation);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    nearestAgent = agent;
                }
            }
        }

        return nearestAgent;
    }
}




public class question8 {
	
	public static void main(String[] args) {
        DeliveryAgent[] agents = {
            new DeliveryAgent("Agent Alpha", new GeoPoint(1, 1), true),
            new DeliveryAgent("Agent Bravo", new GeoPoint(5, 5), false),
            new DeliveryAgent("Agent Charlie", new GeoPoint(3, 3), true)
        };

        DeliveryAgentService agentService = new DeliveryAgentService(agents);
        GeoPoint orderLocation = new GeoPoint(2, 2);

        DeliveryAgent nearestAgent = agentService.findNearestAvailableAgent(orderLocation);

        if (nearestAgent != null) {
            System.out.println("Nearest available delivery agent: " + nearestAgent.name);
        } else {
            System.out.println("No available delivery agents found.");
        }
    }

}
