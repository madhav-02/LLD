# Parking Lot

## Requirements
- Multiple parking levels, each with spots of different types.
- Vehicles of different types (`VehicleType`) park in matching spots.
- Entry gate issues a ticket; exit gate computes the fee and takes payment.
- Display board shows available spots.
- Pluggable pricing, payment methods and spot-allocation strategy.

## Package structure
| Package | Responsibility |
|---------|----------------|
| `parking` | `ParkingLot`, `ParkingLevel`, `ParkingSpot`, `ParkingService` |
| `vehicle` | `Vehicle`, `VehicleType`, `VehicleFactory` |
| `ticket` | `Ticket`, `TicketStatus`, `TicketService` |
| `pricing` | `PricingStrategy`, `StandardPricingStrategy` |
| `payment` | `PaymentStrategy` (`UPIPayment`, `CreditCardPayment`), `PaymentService`, `PaymentStatus` |
| `strategy` | `SpotAllocationStrategy`, `BaseAllocationStrategy` |
| `display` | `DisplayBoard` |
| (root) | `EntryGate`, `ExitGate`, `Main` |

## Design patterns
- **Strategy** – pricing, payment, spot allocation
- **Factory** – vehicle creation

## Run
Open the `parking-lot` module in IntelliJ and run `Main`, or:
```bash
javac -d out $(find src -name "*.java") && java -cp out Main
```
