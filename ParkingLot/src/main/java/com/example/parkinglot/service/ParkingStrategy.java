package com.example.parkinglot.service;

public interface ParkingStrategy {
    void getNearestParkingSpot(Terminal terminal, ParkingSpot parkingSpot);
}
