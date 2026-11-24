package vehicle;

public class VehicleFactory {
    private  VehicleFactory(){
        // No instanstiation
    }

    public static Vehicle createVehicle(String vehicleNumber, VehicleType vehicleType){
        return new Vehicle(vehicleNumber, vehicleType);
    }
}
