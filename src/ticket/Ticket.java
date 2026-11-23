package ticket;

import parking.ParkingSpot;
import payment.PaymentStatus;
import vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double parkingFee;
    private TicketStatus status;
    private PaymentStatus paymentStatus;
}
