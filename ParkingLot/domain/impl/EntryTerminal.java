package ParkingLot.domain.impl;

import ParkingLot.domain.ParkingSpot;
import ParkingLot.domain.Printable;
import ParkingLot.domain.Terminal;

public class EntryTerminal implements Terminal {

    private Printer printer;

    public ParkingTicket getTicket(ParkingSpot parkingSpot) {
        // Return parking ticket if spot is available
        return null;
    }

    @Override
    public String print(Printable printable) {
        return printer.print(printable);
    }
    
}
