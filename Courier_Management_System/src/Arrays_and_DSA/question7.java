package Arrays_and_DSA;

import java.util.ArrayList;
import java.util.List;

class Location {
    int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Parcel {
    String parcelId;
    List<Location> trackingHistory;

    public Parcel(String parcelId) {
        this.parcelId = parcelId;
        this.trackingHistory = new ArrayList<>();
    }

    // Method to add a location update
    public void addLocationUpdate(Location location) {
        trackingHistory.add(location);
    }

    // Method to display the tracking history
    public void displayTrackingHistory() {
        System.out.println("Tracking History for " + parcelId + ":");
        for (Location location : trackingHistory) {
            System.out.println(location);
        }
    }
}


public class question7 {
	
	public static void main(String[] args) {
        Parcel parcel = new Parcel("Parcel123");

        // Simulating location updates
        parcel.addLocationUpdate(new Location(0, 0));
        parcel.addLocationUpdate(new Location(1, 2));
        parcel.addLocationUpdate(new Location(3, 5));
        parcel.addLocationUpdate(new Location(5, 8));

        // Displaying the tracking history
        parcel.displayTrackingHistory();
    }

}
