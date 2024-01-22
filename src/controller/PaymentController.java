package controller;

import model.*;
import service.GateService;
import service.PaymentService;
import service.TicketService;

public class PaymentController {
    private final GateService gateService;
    private final TicketService ticketService;
    private final PaymentService paymentService;

    public PaymentController() {
        this.gateService = GateService.getGateService();
        this.ticketService = TicketService.getTicketService();
        this.paymentService = new PaymentService();
    }

    public Bill generateBill(String ticketId, int gateId) {
        ParkingGate gate = gateService.getGate(gateId);
        Ticket ticket = ticketService.getTicket(ticketId);
        return paymentService.generateBill(ticket, gate);
    }

    public void postPayment(Bill bill, PaymentMode paymentMode) {
        //getConfirmationFromThirdParty
        //generateReceipt
    }
}
