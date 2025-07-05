import java.util.Random;

public class PassengerSource {
    private Company company;

    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        Random random = new Random();
        
        // Generate random pickup and destination locations
        Location pickupLocation = new Location(random.nextInt(101), random.nextInt(101));
        Location destinationLocation = new Location(random.nextInt(101), random.nextInt(101));
        
        // Create a new passenger
        Passenger passenger = new Passenger(pickupLocation, destinationLocation);
        
        // Schedule a vehicle for the passenger
        return company.scheduleVehicle(passenger);
    }
}
