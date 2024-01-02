package org.example.parkinglot.Strategies;

import org.example.parkinglot.Models.*;

import java.util.Optional;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public Optional<ParkingSlot> allocateSlot(ParkingFloor parkingFloor, Vehicle vehicle, Gate gate) {
        return null;
    }
}
