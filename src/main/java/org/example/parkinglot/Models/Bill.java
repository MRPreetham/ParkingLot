package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.FeeCalculatorStrategyType;
import org.example.parkinglot.Enums.PaymentMode;
import org.example.parkinglot.Enums.PaymentStatus;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Bill extends BaseModel{
    private Date exitTime;
    private Ticket ticket;
    private int fee;
    private Operator generatedBy;
    private List<Payment> paymentList;
    private FeeCalculatorStrategyType feeCalculatorStrategyType;
}
