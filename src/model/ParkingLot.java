package model;

import java.util.List;

public class ParkingLot {
    private String name;
    private String address;
    private final List<ParkingZone> parkingZones;
    private final List<ParkingGate> entryGates;
    private final List<ParkingGate> exitGates;

    public ParkingLot(String name, String address, List<ParkingZone> parkingZones, List<ParkingGate> entryGates, List<ParkingGate> exitGates) {
        this.name = name;
        this.address = address;
        this.parkingZones = parkingZones;
        this.entryGates = entryGates;
        this.exitGates = exitGates;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<ParkingZone> getParkingZones() {
        return parkingZones;
    }

    public List<ParkingGate> getEntryGates() {
        return entryGates;
    }

    public List<ParkingGate> getExitGates() {
        return exitGates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
