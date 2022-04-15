package com.example.parkinglot.service.impl;

import com.example.parkinglot.service.ParkingSpot;
import com.example.parkinglot.service.ParkingStrategy;

public class CompactParkingSpot implements ParkingSpot {

    private long id;
    private ParkingStrategy parkingStrategy;

    @Override
    public ParkingTicket reserve() {
        return null;
    }

    @Override
    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

}
