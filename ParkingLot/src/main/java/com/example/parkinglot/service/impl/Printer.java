package com.example.parkinglot.service.impl;

import com.example.parkinglot.service.Printable;

public class Printer {
    public String print(Printable printable) {
        // Prints the parking ticket/payment receipt
        return printable.toString();
    }
}
