package model;

import java.time.OffsetDateTime;

public class Bill {
    private final String billId;
    private final Ticket ticket;
    private final OffsetDateTime timestamp;
    private final double amount;
    private final ParkingGate exitGate;
    private final ParkingAttendant exitAttendant;

    public Bill(String billId, Ticket ticket, OffsetDateTime timestamp, double amount, ParkingGate exitGate, ParkingAttendant exitAttendant) {
        this.billId = billId;
        this.ticket = ticket;
        this.timestamp = timestamp;
        this.amount = amount;
        this.exitGate = exitGate;
        this.exitAttendant = exitAttendant;
    }

    public String getBillId() {
        return billId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public ParkingGate getExitGate() {
        return exitGate;
    }

    public ParkingAttendant getExitAttendant() {
        return exitAttendant;
    }
}
