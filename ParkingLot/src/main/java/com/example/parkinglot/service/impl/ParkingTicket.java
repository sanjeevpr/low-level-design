package ParkingLot.domain.impl;

import java.util.Date;
import ParkingLot.domain.ParkingSpot;
import ParkingLot.domain.Printable;

public class ParkingTicket implements Printable {
    private long id;
    private long parkingSpotId;
    private ParkingSpot parkingSpot;
    private Date entryTime;

    // Use builder to construct the object

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getParkingSpotId() {
        return parkingSpotId;
    }
    public void setParkingSpotId(long parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
