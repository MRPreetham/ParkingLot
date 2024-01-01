package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;
    private Gate EntryGate;
    private Gate ExitGate;

    public ParkingFloor(int floorNumber,List<ParkingSlot> parkingSlots,Gate EntryGate,Gate ExitGate){
        this.floorNumber = floorNumber;
        this.parkingSlots = parkingSlots;
        this.EntryGate = EntryGate;
        this.ExitGate = ExitGate;
    }
}
