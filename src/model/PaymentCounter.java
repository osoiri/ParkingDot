package model;

public class PaymentCounter {
    private final int counterId;
    private CounterStatus counterStatus;
    private ParkingAttendant parkingAttendant;

    public PaymentCounter(int counterId) {
        this.counterId = counterId;
        this.counterStatus = CounterStatus.CLOSE;
    }

    public int getCounterId() {
        return counterId;
    }

    public CounterStatus getCounterStatus() {
        return counterStatus;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }

    public void setCounterStatus(CounterStatus counterStatus) {
        this.counterStatus = counterStatus;
    }

    public void setParkingAttendant(ParkingAttendant parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }

    @Override
    public String toString() {
        return "PaymentCounter{" +
                "counterId=" + counterId +
                ", counterStatus=" + counterStatus +
                ", parkingAttendant=" + parkingAttendant +
                '}';
    }
}
