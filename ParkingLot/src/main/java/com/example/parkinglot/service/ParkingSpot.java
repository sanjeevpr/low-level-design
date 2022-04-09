package com.example.parkinglot.service;


import com.example.parkinglot.service.impl.ParkingTicket;

public interface ParkingSpot {
    public ParkingTicket reserve();
}
