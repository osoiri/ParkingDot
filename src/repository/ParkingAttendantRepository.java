package repository;

import model.ParkingAttendant;

import java.util.HashMap;
import java.util.Map;

public class ParkingAttendantRepository {
    private final Map<String, ParkingAttendant> attendants;

    public ParkingAttendantRepository() {
        this.attendants = new HashMap<>();
        ParkingAttendant attendantOne = new ParkingAttendant("Shyam", "shyam.guru@plot.com");
        ParkingAttendant attendantTwo = new ParkingAttendant("Jadhav", "jadhav.ahmed@plot.com");
        ParkingAttendant attendantThree = new ParkingAttendant("Shailaja", "shailaja.sim@plot.com");
        ParkingAttendant attendantFour = new ParkingAttendant("Simran","simran.sukhu@plot.com");
        attendants.put(attendantOne.getName(), attendantOne);
        attendants.put(attendantTwo.getName(), attendantTwo);
        attendants.put(attendantThree.getName(), attendantThree);
        attendants.put(attendantFour.getName(), attendantFour);
    }

    public Map<String, ParkingAttendant> getAttendants() {
        return attendants;
    }

    public ParkingAttendant getParkingAttendantByName(String name) {
        return attendants.get(name);
    }

    public void insertParkingAttendant(ParkingAttendant parkingAttendant) {
        attendants.put(parkingAttendant.getName(), parkingAttendant);
    }
}
