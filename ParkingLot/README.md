# Parking Lot LLD
The low-level design implementation of the huge multi-level parking lot based on the requirements below.
- Big parking lot around 10k to 30k spots
- 4 entrances and 4 exits
- Ticket and spot attached at the entrance
- Parking spot should be nearest to the entrance
- Limit/Capacity around 30k
- Different types of parking spots - handicapped, compact, large, motorcycle, etc
- Hourly rates
- Payment through cash and Credit card
- Monitoring system

## Actors
1. Parking lot system
2. Terminals
    - EntryTerminal
    - ExitTerminal
    - Printer
    - PaymentProcessor
        - CardPaymentProcessor
        - CashPaymentProcessor
3. Parking Spot
    - Handicapped
    - Compact
    - Large
    - Motorcycle
4. ParkingTicket
5. PaymentMethod
    - Cash
    - Card
5. Database
6. Monitoring system
