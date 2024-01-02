package org.example.parkinglot.Strategies;

import org.example.parkinglot.Models.*;

import java.util.Optional;

public interface SlotAllocationStrategy {
    public Optional<ParkingSlot>  allocateSlot(ParkingFloor parkingFloor, Vehicle vehicle, Gate gate);
}
