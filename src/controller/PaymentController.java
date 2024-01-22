package controller;

import model.Bill;
import model.PaymentMode;
import model.Receipt;

public class PaymentController {
    public void generateBill(String ticketId, int gateId) {
        //get Gate
        //get Ticket
        //generateBill
    }

    public void postPayment(Bill bill, PaymentMode paymentMode) {
        //getConfirmationFromThirdParty
        //generateReceipt
    }
}
