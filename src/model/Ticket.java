package model;

import java.time.Instant;
import java.time.OffsetDateTime;

public class Ticket {
    private final String ticketId;
    private final OffsetDateTime timestamp;
    private final Vehicle vehicle;
    private final ParkingGate issuingGate;
    private final String zoneId;
    private final ParkingSpot spot;
    private final ParkingAttendant parkingAttendant;
    private TicketStatus ticketStatus;

    private Ticket(Builder builder) {
        this.ticketId = generateTicketId(builder.vehicle.getVehicleNumber());
        this.timestamp = OffsetDateTime.now();
        this.vehicle = builder.vehicle;
        this.issuingGate = builder.issuingGate;
        this.zoneId = builder.zoneId;
        this.spot = builder.spot;
        this.parkingAttendant = builder.parkingAttendant;
        this.ticketStatus = TicketStatus.GENERATED;
    }

    public String getTicketId() {
        return ticketId;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingGate getIssuingGate() {
        return issuingGate;
    }

    public String getZoneId() {
        return zoneId;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    private String generateTicketId(String vehicleNumber) {
        return vehicleNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", timestamp=" + timestamp +
                ", vehicle=" + vehicle +
                ", issuingGate=" + issuingGate +
                ", zoneId='" + zoneId + '\'' +
                ", spot=" + spot +
                ", parkingAttendant=" + parkingAttendant.getName() +
                ", ticketStatus=" + ticketStatus +
                '}';
    }

    public static class Builder {
        private Vehicle vehicle;
        private ParkingGate issuingGate;
        private String zoneId;
        private ParkingSpot spot;

        private ParkingAttendant parkingAttendant;

        public Builder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder setIssuingGate(ParkingGate issuingGate) {
            this.issuingGate = issuingGate;
            return this;
        }

        public Builder setZone(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setSpot(ParkingSpot spot) {
            this.spot = spot;
            return this;
        }

        public Builder setParkingAttendant( ParkingAttendant parkingAttendant) {
            this.parkingAttendant = parkingAttendant;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
