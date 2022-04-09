package com.example.parkinglot.service.impl;

import java.util.Date;
import com.example.parkinglot.service.ParkingSpot;
import com.example.parkinglot.service.Printable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingTicket implements Printable {
    private long id;
    private long parkingSpotId;
    private ParkingSpot parkingSpot;
    private Date entryTime;
}
