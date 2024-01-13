package model;

import java.time.Instant;
import java.time.OffsetDateTime;

public class Ticket {
    private final String ticketId;
    private final OffsetDateTime timestamp;
    private final Vehicle vehicle;
    private final ParkingGate issuingGate;
    private final ParkingFloor floor;
    private final ParkingSpot spot;
    private TicketStatus ticketStatus;

    private Ticket(Builder builder) {
        this.ticketId = generateTicketId(builder.vehicle.getVehicleNumber());
        this.timestamp = OffsetDateTime.from(Instant.now());
        this.vehicle = builder.vehicle;
        this.issuingGate = builder.issuingGate;
        this.floor = builder.floor;
        this.spot = builder.spot;
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

    public ParkingFloor getFloor() {
        return floor;
    }

    public ParkingSpot getSpot() {
        return spot;
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

    public static class Builder {
        private Vehicle vehicle;
        private ParkingGate issuingGate;
        private ParkingFloor floor;
        private ParkingSpot spot;

        public Builder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder setIssuingGate(ParkingGate issuingGate) {
            this.issuingGate = issuingGate;
            return this;
        }

        public Builder setFloor(ParkingFloor floor) {
            this.floor = floor;
            return this;
        }

        public Builder setSpot(ParkingSpot spot) {
            this.spot = spot;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
