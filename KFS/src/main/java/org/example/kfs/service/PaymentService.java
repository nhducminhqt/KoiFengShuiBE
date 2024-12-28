package org.example.kfs.service;

import com.fengshuisystem.demo.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    PaymentDTO getPaymentById(Integer paymentId);

    List<PaymentDTO> getAll();
}
