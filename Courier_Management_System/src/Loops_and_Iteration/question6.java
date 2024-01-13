package Loops_and_Iteration;

class Location {
    int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Check if two locations are the same
    public boolean equals(Location other) {
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Courier {
    String id;
    Location currentLocation;

    public Courier(String id, Location startLocation) {
        this.id = id;
        this.currentLocation = startLocation;
    }

    // Moves the courier closer to the destination by one step
    public void moveTo(Location destination) {
        if (currentLocation.x < destination.x) currentLocation.x++;
        else if (currentLocation.x > destination.x) currentLocation.x--;

        if (currentLocation.y < destination.y) currentLocation.y++;
        else if (currentLocation.y > destination.y) currentLocation.y--;
    }

    public boolean hasReached(Location destination) {
        return currentLocation.equals(destination);
    }
}

public class question6 {
	
	public static void main(String[] args) {
        Courier courier = new Courier("Courier1", new Location(0, 0));
        Location destination = new Location(5, 5);

        System.out.println("Starting courier tracking...");
        while (!courier.hasReached(destination)) {
            courier.moveTo(destination);
            System.out.println("Current location of " + courier.id + ": " + courier.currentLocation);
            try {
                Thread.sleep(1000); // Simulating time delay for each step
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The courier has reached the destination.");
    }

}
