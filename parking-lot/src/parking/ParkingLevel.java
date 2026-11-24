package parking;

import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingLevel {
    private final int levelNumber;
    private final   List<ParkingSpot> parkingSpots;

    ParkingLevel(int levelNumber){
        this.levelNumber = levelNumber;
        this.parkingSpots = new ArrayList<>();
    }

    public List<ParkingSpot> getAvailableSpots(VehicleType type){
        return parkingSpots.stream()
                .filter(parkingSpot -> parkingSpot.isAvailable())
                .filter(parkingSpot -> parkingSpot.getSupportedVehicleType() == type)
                .collect(Collectors.toList());
    }

    public int getAvailableSpotsCount(VehicleType type){
        return (int) parkingSpots.stream()
                .filter(spot -> spot.getSupportedVehicleType() == type)
                .filter(spot -> spot.isAvailable())
                .count();
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpots.add(parkingSpot);
    }

    public int getLevelNumber(){
        return this.levelNumber;
    }
}
