package strategy;

import parking.ParkingLevel;
import parking.ParkingSpot;
import vehicle.Vehicle;

import java.util.List;

public interface SpotAllocationStrategy {
    ParkingSpot findSpot(Vehicle vehicle, List<ParkingLevel> levels);
}
