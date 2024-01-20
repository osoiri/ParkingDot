package repository;

import model.ParkingSpot;
import model.ParkingZone;
import model.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingZoneRepository {
    private final List<ParkingZone> zones;

    public ParkingZoneRepository() {
        this.zones = new ArrayList<>();
        List<ParkingSpot> spotOne = generateParkingSpotsForZones(1, VehicleType.COMPACT_FOUR_WHEELER);
        List<ParkingSpot> spotTwo = generateParkingSpotsForZones(2, VehicleType.TWO_WHEELER);
        List<ParkingSpot> spotThree = generateParkingSpotsForZones(3, VehicleType.LONG_FOUR_WHEELER);
        ParkingZone zoneOne = new ParkingZone("1A", spotOne, VehicleType.COMPACT_FOUR_WHEELER);
        ParkingZone zoneTwo = new ParkingZone("1B", spotTwo, VehicleType.TWO_WHEELER);
        ParkingZone zoneThree = new ParkingZone("1C", spotThree, VehicleType.LONG_FOUR_WHEELER);
        zones.add(zoneOne);
        zones.add(zoneTwo);
        zones.add(zoneThree);
    }

    private List<ParkingSpot> generateParkingSpotsForZones(int nonce, VehicleType vehicleType) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for (int i=0;i<10;i++) {
            parkingSpots.add(new ParkingSpot((nonce + 1)*1000 + i + 1, vehicleType));
        }
        return parkingSpots;
    }

    public List<ParkingZone> getZones() {
        return zones;
    }

    public List<ParkingZone> getZoneByVehicleType(VehicleType vehicleType) {
        List<ParkingZone> eligibleZones = new ArrayList<>();
        for (ParkingZone zone: zones) {
            if (zone.getZoneType() == vehicleType) {
                eligibleZones.add(zone);
            }
        }
        return eligibleZones;
    }
}
