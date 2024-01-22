package service;

import exception.InternalServiceException;
import model.*;
import repository.ParkingZoneRepository;
import repository.TicketRepository;

import java.util.List;

public class TicketService {
    private final ParkingZoneRepository parkingZoneRepository;
    private final TicketRepository ticketRepository;

    public static TicketService ticketService = null;

    private TicketService() {
        this.parkingZoneRepository = new ParkingZoneRepository();
        this.ticketRepository = new TicketRepository();
    }

    public static TicketService getTicketService() {
        if (ticketService == null) {
            synchronized (TicketService.class) {
                if (ticketService == null) {
                    ticketService = new TicketService();
                }
            }
        }
        return ticketService;
    }

    synchronized public Ticket createTicket(ParkingGate parkingGate, Vehicle vehicle) {
        List<ParkingZone> zones = parkingZoneRepository.getZoneByVehicleType(vehicle.getVehicleType());
        ParkingSpot assignedSpot = null;
        ParkingZone assignedZone = null;
        a: for (ParkingZone zone: zones) {
            b: for (ParkingSpot spot: zone.getParkingSpots()) {
                if (spot.getSpotStatus() == SpotStatus.AVAILABLE) {
                    assignedSpot = spot;
                    assignedZone = zone;
                    assignedSpot.setSpotStatus(SpotStatus.BOOKED);
                    break a;
                }
            }
        }

        if (assignedSpot == null ) {
            throw new InternalServiceException("No space available for parking. Please wait!!!");
        }

        Ticket ticket = Ticket.getBuilder()
                .setIssuingGate(parkingGate)
                .setVehicle(vehicle)
                .setSpot(assignedSpot)
                .setZone(assignedZone.getZoneId())
                .setParkingAttendant(parkingGate.getParkingAttendant())
                .build();
        ticketRepository.addTicket(ticket);
        return ticket;
    }

    public Ticket getTicket(String ticketId) {
        return ticketRepository.getTicketById(ticketId);
    }
}
