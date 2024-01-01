package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.FeeCalculatorStrategyType;
import org.example.parkinglot.Enums.ParkingSlotStatus;
import org.example.parkinglot.Enums.SpotAssignmentStrategyType;
import org.example.parkinglot.Enums.VehicleType;

import java.util.List;

@Getter
@Setter
public class ParkingSlot extends BaseModel{
    private int spotNumber;
    private ParkingSlotStatus slotStatus;
    private List<VehicleType> vehicleTypeList;
    private ParkingFloor parkingFloor;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;

    public ParkingSlot(int spotNumber,ParkingSlotStatus slotStatus,List<VehicleType> vehicleTypeList,ParkingFloor parkingFloor){
        this.spotNumber = spotNumber;
        this.slotStatus = slotStatus;
        this.vehicleTypeList = vehicleTypeList;
        this.parkingFloor = parkingFloor;
    }
}
