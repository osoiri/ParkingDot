package model;

public class ParkingSpot {
    private final int spotId;
    private VehicleType spotType;
    private SpotStatus spotStatus;

    public ParkingSpot(int spotId, VehicleType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.spotStatus = SpotStatus.AVAILABLE;
    }

    public int getSpotId() {
        return spotId;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotType(VehicleType spotType) {
        this.spotType = spotType;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId=" + spotId +
                ", spotType=" + spotType +
                ", spotStatus=" + spotStatus +
                '}';
    }
}
