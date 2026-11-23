package pricing;

import vehicle.Vehicle;

import java.time.LocalDateTime;

public class StandardPricingStrategy implements PricingStrategy{

    @Override
    public double calculateFee(Vehicle vehicle, LocalDateTime entryTime, LocalDateTime exitTime) {
        return switch (vehicle.getVehicleType()) {
            case BIKE -> 20;
            case CAR -> 50;
            case TRUCK -> 100;
            default -> throw new IllegalArgumentException("Unsupported vehicle type");
        };
    }
}
