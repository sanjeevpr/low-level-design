package ParkingLot.domain.impl;

import ParkingLot.domain.Printable;

public class PaymentReceipt implements Printable {
    private long id;
    private long paymentId;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }
}
