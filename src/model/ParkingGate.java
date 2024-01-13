package model;

import java.util.List;

public class ParkingGate {
    private final int id;
    private final List<PaymentCounter> paymentCounters;
    private ParkingAttendant parkingAttendant;
    private GateType gateType;
    private GateStatus gateStatus;

    public ParkingGate(int id, List<PaymentCounter> paymentCounters, GateType gateType) {
        this.id = id;
        this.paymentCounters = paymentCounters;
        this.gateType = gateType;
        this.gateStatus = GateStatus.CLOSE;
    }

    public int getId() {
        return id;
    }

    public List<PaymentCounter> getPaymentCounters() {
        return paymentCounters;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }

    public GateType getGateType() {
        return gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setParkingAttendant(ParkingAttendant parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
