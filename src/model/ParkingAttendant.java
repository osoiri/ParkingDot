package model;

public class ParkingAttendant {
    private final String name;
    private final String email;

    public ParkingAttendant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
