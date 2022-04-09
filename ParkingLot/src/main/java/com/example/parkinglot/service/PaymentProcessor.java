package com.example.parkinglot.service;

import java.math.BigDecimal;

import ParkingLot.domain.impl.PaymentMethod;

public interface PaymentProcessor {
    // Processes the payment
    // Accepts the given payment method i.e. Cash/Card
    // Returns payment receipt
    String processPayment(BigDecimal cost, PaymentMethod paymentMethod);
}
