package ParkingLot.domain;

import ParkingLot.domain.impl.ParkingTicket;

public interface ParkingSpot {
    public ParkingTicket reserve();
}
