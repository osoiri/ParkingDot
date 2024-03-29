package service;

import model.GateStatus;
import model.ParkingAttendant;
import model.ParkingGate;
import repository.GateRepository;

public class GateService {
    private final GateRepository gateRepository;
    private static GateService gateService = null;

    public static GateService getGateService() {
        if (gateService == null) {
            synchronized (GateService.class) {
                if (gateService == null) {
                    gateService = new GateService();
                }
            }
        }
        return gateService;
    }

    private GateService() {
        this.gateRepository = new GateRepository();
    }

    public ParkingGate getGate(int gateId) {
        return gateRepository.getGateById(gateId);
    }

    public boolean toggleGate(int gateId) {
        ParkingGate gate = gateRepository.getGateById(gateId);
        if (gate.getGateStatus() == GateStatus.OPEN) {
            gate.setGateStatus(GateStatus.CLOSE);
            return true;
        } else if (gate.getGateStatus() == GateStatus.CLOSE) {
            gate.setGateStatus(GateStatus.OPEN);
            return true;
        } else {
            return false;
        }
    }
}
