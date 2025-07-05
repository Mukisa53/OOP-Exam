import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyTest {
    private Company company;

    @BeforeEach
    public void setUp() {
        company = new Company();
    }

    @Test
    public void testScheduleVehicle_Success() {
        Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));
        boolean result = company.scheduleVehicle(passenger);
        assertTrue(result, "The vehicle should be scheduled successfully.");
    }

    @Test
    public void testScheduleVehicle_Failure_NoAvailableVehicles() {
        // Assuming the company starts with no vehicles available
        Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));
        boolean result = company.scheduleVehicle(passenger);
        assertFalse(result, "The vehicle should not be scheduled when none are available.");
    }
}

