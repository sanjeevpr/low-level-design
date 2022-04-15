package com.example.parkinglot.service;

import com.example.parkinglot.service.impl.ParkingTicket;

public interface ParkingSpot {
    ParkingTicket reserve(Terminal terminal, ParkingSpot parkingSpot);
    void setParkingStrategy(ParkingStrategy parkingStrategy);
}
