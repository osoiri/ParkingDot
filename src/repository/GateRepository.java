package repository;

import model.GateType;
import model.ParkingGate;
import model.PaymentCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GateRepository {
    private final Map<Integer, ParkingGate> gates;
    private final ParkingAttendantRepository parkingAttendantRepository;

    public GateRepository() {
        this.gates = new HashMap<>();
        parkingAttendantRepository = new ParkingAttendantRepository();
        ParkingGate gateOne = new ParkingGate(1, null, GateType.ENTRY);
        gateOne.setParkingAttendant(parkingAttendantRepository.getParkingAttendantByName("Shyam"));
        ParkingGate gateTwo = new ParkingGate(2, new ArrayList<>(List.of(new PaymentCounter(1), new PaymentCounter(2))), GateType.EXIT);
        gateTwo.getPaymentCounters().getFirst().setParkingAttendant(parkingAttendantRepository.getParkingAttendantByName("Shailaja"));
        gateTwo.getPaymentCounters().get(1).setParkingAttendant(parkingAttendantRepository.getParkingAttendantByName("Simran"));
        gates.put(1, gateOne);
        gates.put(2, gateTwo);
    }

    public ParkingGate getGateById(int gateId) {
        return gates.get(gateId);
    }
}
