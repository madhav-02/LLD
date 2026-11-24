package parking;

import strategy.SpotAllocationStrategy;
import vehicle.Vehicle;

import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private List<ParkingLevel> parkingLevels;
    private SpotAllocationStrategy allocationStrategy;

    public ParkingLot getInstance() {
        return parkingLot;
    }

    public ParkingSpot allocateSpot(Vehicle vehicle){
        ParkingSpot parkingSpot = allocationStrategy.findSpot(vehicle, parkingLevels);
        return parkingSpot;

    }

    public void releaseSpot(ParkingSpot parkingSpot){
        Vehicle vehicle = parkingSpot.removeVehicle();
    }

    public List<ParkingLevel> getLevels(){

    }
}
