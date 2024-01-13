package model;

import java.time.OffsetDateTime;

public class Receipt {
    private final Payment payment;
    private final ReceiptType receiptType;
    private final OffsetDateTime timestamp;
    private final boolean isGstIncluded;

    public Receipt(Payment payment, ReceiptType receiptType, OffsetDateTime timestamp, boolean isGstIncluded) {
        this.payment = payment;
        this.receiptType = receiptType;
        this.timestamp = timestamp;
        this.isGstIncluded = isGstIncluded;
    }

    public Payment getPayment() {
        return payment;
    }

    public ReceiptType getReceiptType() {
        return receiptType;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isGstIncluded() {
        return isGstIncluded;
    }
}
