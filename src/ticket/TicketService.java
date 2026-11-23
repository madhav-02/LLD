package ticket;

import parking.ParkingSpot;
import vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.Map;

public class TicketService {
    private Map<String, Ticket> tickets;

    public Ticket createTicket(Vehicle vehicle, ParkingSpot spot, LocalDateTime entryTime){

    }

    public Ticket getTicket(String ticketId){

    }

    public void closeTicket(Vehicle vehicle, LocalDateTime exitTime, double parkingFee){

    }
}
