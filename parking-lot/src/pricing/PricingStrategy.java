package pricing;

import vehicle.Vehicle;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double calculateFee(Vehicle vehicle, LocalDateTime entryTime, LocalDateTime exitTime);
}
