package repository;

import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private final Map<String, Ticket> tickets;

    public TicketRepository() {
        this.tickets = new HashMap<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.put(ticket.getTicketId(), ticket);
    }

    public Ticket getTicketById(String ticketId) {
        return tickets.get(ticketId);
    }
}
