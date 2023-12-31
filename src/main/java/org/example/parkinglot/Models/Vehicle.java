package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.VehicleType;

@Getter
@Setter
public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;
}
