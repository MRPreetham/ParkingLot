package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.PaymentMode;
import org.example.parkinglot.Enums.PaymentStatus;

@Getter
@Setter
public class Payment extends BaseModel{
    private PaymentMode paymentMode;
    private int amount;
    private PaymentStatus paymentStatus;
    private String paymentNumber;
}
