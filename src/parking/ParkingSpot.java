package parking;

import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingSpot {
    private final String Id;
    private final VehicleType supportedVehicleType;
    private Vehicle parkedVehicle;

    ParkingSpot(String Id, VehicleType vehicleType){
        this.Id = Id;
        this.supportedVehicleType = vehicleType;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return isAvailable() && vehicle.getVehicleType().equals(supportedVehicleType);
    }

    public boolean isAvailable(){
        return parkedVehicle==null;
    }

    public boolean parkVehicle(Vehicle vehicle){
        if(!canFitVehicle(vehicle))
            return false;
        this.parkedVehicle = vehicle;
        return true;
    }

    public Vehicle removeVehicle(){
        Vehicle vehicle = parkedVehicle;
        parkedVehicle = null;
        return vehicle;
    }
}
