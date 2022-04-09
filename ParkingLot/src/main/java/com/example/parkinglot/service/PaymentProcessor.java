package com.example.parkinglot.service;

import com.example.parkinglot.service.impl.PaymentMethod;

import java.math.BigDecimal;

public interface PaymentProcessor {
    // Processes the payment
    // Accepts the given payment method i.e. Cash/Card
    // Returns payment receipt
    String processPayment(BigDecimal cost, PaymentMethod paymentMethod);
}
