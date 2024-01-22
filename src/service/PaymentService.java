package service;

import model.Bill;
import model.ParkingGate;
import model.Ticket;

import java.time.OffsetDateTime;

public class PaymentService {
    public Bill generateBill(Ticket ticket, ParkingGate parkingGate) {
        return new Bill("LA1AXA23456791", ticket,
                OffsetDateTime.now(), 20, parkingGate,
                parkingGate.getPaymentCounters().getFirst().getParkingAttendant(),
                parkingGate.getPaymentCounters().getFirst());
    }
}
