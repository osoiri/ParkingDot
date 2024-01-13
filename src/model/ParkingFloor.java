package model;

import java.util.List;

public class ParkingFloor {
    private final int floorId;
    private final List<ParkingSpot> parkingSpots;
    private FloorStatus floorStatus;

    public ParkingFloor(int floorId, List<ParkingSpot> parkingSpots) {
        this.floorId = floorId;
        this.parkingSpots = parkingSpots;
        this.floorStatus = FloorStatus.OK;
    }

    public int getFloorId() {
        return floorId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
