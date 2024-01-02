package org.example.parkinglot.Strategies;

import org.example.parkinglot.Enums.ParkingSlotStatus;
import org.example.parkinglot.Models.*;

import java.util.List;
import java.util.Optional;

public class RandomSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public Optional<ParkingSlot> allocateSlot(ParkingFloor parkingFloor, Vehicle vehicle, Gate gate) {
        List<ParkingSlot> parkingSlots = parkingFloor.getParkingSlots();
        for(ParkingSlot parkingSlot:parkingSlots){
            if(parkingSlot.getSlotStatus().equals(ParkingSlotStatus.EMPTY) && parkingSlot.getVehicleTypeList().contains(vehicle.getVehicleType())){
                return Optional.of(parkingSlot);
            }
        }
        return Optional.empty();
    }
}
