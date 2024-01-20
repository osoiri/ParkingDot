package controller;

import model.*;
import service.GateService;
import service.TicketService;

public class TicketController {
    private final TicketService ticketService;
    private final GateService gateService;

    public TicketController() {
        this.ticketService = new TicketService();
        this.gateService = new GateService();
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId) {
        final ParkingGate gate = gateService.getGate(gateId);
        return ticketService.createTicket(gate, vehicle);
    }

    public boolean toggleGate(int gateId) {
        return gateService.toggleGate(gateId);
    }

    public boolean gateStatusOverride(int gateId, GateStatus gateStatus) {
        //override the status with the help of admins
        return true;
    }
}