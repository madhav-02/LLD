package strategy;

import parking.ParkingLevel;
import parking.ParkingSpot;
import vehicle.Vehicle;

import java.util.List;

public class BaseAllocationStrategy implements SpotAllocationStrategy{

    @Override
    public ParkingSpot findSpot(Vehicle vehicle, List<ParkingLevel> levels) {
        return null;
    }
}
