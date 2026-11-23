package parking;

import payment.PaymentService;
import payment.PaymentStrategy;
import pricing.PricingStrategy;
import ticket.Ticket;
import ticket.TicketService;
import vehicle.Vehicle;

public class ParkingService {
    private ParkingLot parkingLot;
    private TicketService ticketService;
    private PaymentService paymentService;
    private PricingStrategy pricingStrategy;

    public Ticket parkVehicle(Vehicle vehicle){

    }

    public boolean unParkVehicle(String ticketId, PaymentStrategy paymentStrategy){

    }


}
