package com.example.parkinglot.service.impl;

import com.example.parkinglot.service.Terminal;

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
