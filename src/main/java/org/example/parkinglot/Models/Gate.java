package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.GateType;

@Getter
@Setter
public class Gate extends BaseModel{
    private int gateNumber;
    private Operator currentOperator;
    private GateType gateType;

}
