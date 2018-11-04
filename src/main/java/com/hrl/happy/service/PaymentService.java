package com.hrl.happy.service;

import com.hrl.happy.model.Payment;
import com.hrl.happy.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("paymentService")
public class PaymentService {

    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(@Qualifier("paymentRepository") PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment savePayment(Payment payment) {

        return paymentRepository.save(payment);
    }
}