package com.example.parkinglot.service;


import com.example.parkinglot.service.impl.ParkingTicket;

public interface ParkingSpot {
    ParkingTicket reserve();
    void setParkingStrategy(ParkingStrategy parkingStrategy);
}
