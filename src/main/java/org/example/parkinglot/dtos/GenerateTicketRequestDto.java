package org.example.parkinglot.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.VehicleType;
import org.example.parkinglot.Models.Gate;
import org.example.parkinglot.Models.Vehicle;

import java.util.Date;
@Getter
@Setter
public class GenerateTicketRequestDto {
    private int gateId;
    private String vehicleName;
    private VehicleType vehicleType;
}
