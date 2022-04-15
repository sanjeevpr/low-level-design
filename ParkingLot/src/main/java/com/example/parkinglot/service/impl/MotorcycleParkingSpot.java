package com.example.parkinglot.service.impl;

import com.example.parkinglot.service.ParkingSpot;
import com.example.parkinglot.service.ParkingStrategy;

public class MotorcycleParkingSpot implements ParkingSpot {

    private long id;
    private ParkingStrategy parkingStrategy;

    @Override
    public ParkingTicket reserve() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }
    
}
