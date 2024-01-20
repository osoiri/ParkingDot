package model;

import java.util.List;

public class ParkingZone {
    private final String zoneId;
    private final List<ParkingSpot> parkingSpots;
    private FloorStatus floorStatus;
    private VehicleType zoneType;

    public ParkingZone(String zoneId, List<ParkingSpot> parkingSpots, VehicleType zoneType) {
        this.zoneId = zoneId;
        this.parkingSpots = parkingSpots;
        this.floorStatus = FloorStatus.OK;
        this.zoneType = zoneType;
    }

    public String getZoneId() {
        return zoneId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public VehicleType getZoneType() {
        return zoneType;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public void setZoneType(VehicleType zoneType) {
        this.zoneType = zoneType;
    }
}
