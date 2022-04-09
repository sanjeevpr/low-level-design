package com.example.parkinglot.service.impl;

import java.math.BigDecimal;

import ParkingLot.domain.PaymentProcessor;
import ParkingLot.domain.Printable;
import ParkingLot.domain.Terminal;

public class ExitTerminal implements Terminal {
    
    private ParkingLot.domain.impl.Printer printer;
    private PaymentProcessor paymentProcessor;

    public ExitTerminal(Printer printer, PaymentProcessor paymentProcessor) {
        this.printer = printer;
        this.paymentProcessor = paymentProcessor;
    }

    public BigDecimal acceptTicket(ParkingTicket ticket) {
        // Checks the ticket
        // Calculate and return the bill
        return null;
    }

    @Override
    public String print(Printable printable) {
        return printer.print(printable);
    }
}
