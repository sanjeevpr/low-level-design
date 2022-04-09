package com.example.parkinglot.service.impl;

import ParkingLot.domain.impl.PaymentMethod;
import com.example.parkinglot.service.PaymentProcessor;

import java.math.BigDecimal;

public class CashPaymentProcessor implements PaymentProcessor {

    @Override
    public String processPayment(BigDecimal cost, PaymentMethod paymentMethod) {
        return null;
    }
}
