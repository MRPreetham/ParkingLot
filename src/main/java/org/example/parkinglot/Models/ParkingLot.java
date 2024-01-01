package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.FeeCalculatorStrategyType;
import org.example.parkinglot.Enums.SpotAssignmentStrategyType;
import org.example.parkinglot.Enums.VehicleType;

import java.util.List;
@Getter
@Setter
public class ParkingLot extends BaseModel{
    private String name;
    private List<ParkingFloor> parkingFloorList;
    private List<Vehicle> vehicleList;
    private List<VehicleType> vehicleTypeList;
    private List<Gate> gateList;

    public ParkingLot(String name,List<ParkingFloor> parkingFloorList,List<VehicleType> vehicleTypeList,List<Gate> gateList){
        this.name = name;
        this.parkingFloorList = parkingFloorList;
        this.vehicleTypeList = vehicleTypeList;
        this.gateList = gateList;
    }
}
