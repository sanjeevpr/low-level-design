package com.example.parkinglot.service.impl;

import com.example.parkinglot.service.ParkingSpot;
import com.example.parkinglot.service.Printable;
import com.example.parkinglot.service.Terminal;

public class EntryTerminal implements Terminal {

    private Printer printer;

    public ParkingTicket getTicket(ParkingSpot parkingSpot) {
        // Return parking ticket if spot is available
        parkingSpot.reserve();
        return null;
    }

    @Override
    public String printTicket(Printable printable) {
        return printer.print(printable);
    }
    
}
