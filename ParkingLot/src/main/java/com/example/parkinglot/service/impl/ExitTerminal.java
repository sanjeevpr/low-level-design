package com.example.parkinglot.service.impl;

import com.example.parkinglot.service.PaymentProcessor;
import com.example.parkinglot.service.Printable;
import com.example.parkinglot.service.Terminal;

import java.math.BigDecimal;

public class ExitTerminal implements Terminal {
    
    private Printer printer;
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
    public String printTicket(Printable printable) {
        return printer.print(printable);
    }
}
