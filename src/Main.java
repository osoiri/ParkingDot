import controller.PaymentController;
import controller.TicketController;
import model.Vehicle;
import model.VehicleType;

public class Main {
    public static void main(String[] args) {
        TicketController ticketController = new TicketController();
        PaymentController paymentController = new PaymentController();
        System.out.println(ticketController
                .generateTicket(new Vehicle(
                        "MH 01 EA 2345", VehicleType.LONG_FOUR_WHEELER),
                        1));
        System.out.println(ticketController.toggleGate(1));
        System.out.println(ticketController.toggleGate(1));
        System.out.println(paymentController.generateBill("MH 01 EA 2345", 2));
    }
}
