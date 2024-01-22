package model;

import java.time.OffsetDateTime;

public class Bill {
    private final String billId;
    private final Ticket ticket;
    private final OffsetDateTime timestamp;
    private final double amount;
    private final ParkingGate exitGate;
    private final ParkingAttendant exitAttendant;
    private final PaymentCounter exitCounter;

    public Bill(String billId, Ticket ticket, OffsetDateTime timestamp,
                double amount, ParkingGate exitGate, ParkingAttendant exitAttendant,
                PaymentCounter exitCounter) {
        this.billId = billId;
        this.ticket = ticket;
        this.timestamp = timestamp;
        this.amount = amount;
        this.exitGate = exitGate;
        this.exitAttendant = exitAttendant;
        this.exitCounter = exitCounter;
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

    public PaymentCounter getExitCounter() {
        return exitCounter;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId='" + billId + '\'' +
                ", ticket=" + ticket +
                ", timestamp=" + timestamp +
                ", amount=" + amount +
                ", exitGate=" + exitGate +
                ", exitAttendant=" + exitAttendant +
                ", exitCounter=" + exitCounter +
                '}';
    }
}
