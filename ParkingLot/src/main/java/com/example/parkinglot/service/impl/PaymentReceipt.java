package com.example.parkinglot.service.impl;

import com.example.parkinglot.service.Printable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentReceipt implements Printable {
    private long id;
    private long paymentId;
}
