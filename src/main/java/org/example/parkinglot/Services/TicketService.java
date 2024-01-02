package org.example.parkinglot.Services;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Enums.VehicleType;
import org.example.parkinglot.Exceptions.InvalidGateIdException;
import org.example.parkinglot.Exceptions.InvalidParkingLotId;
import org.example.parkinglot.Exceptions.ParkingSlotNotAvailableException;
import org.example.parkinglot.Models.*;
import org.example.parkinglot.Repositories.GateRepository;
import org.example.parkinglot.Repositories.ParkingFloorRepository;
import org.example.parkinglot.Repositories.ParkingLotRepository;
import org.example.parkinglot.Repositories.VehicleRepository;
import org.example.parkinglot.Strategies.SlotAllocationStrategy;


import java.util.Date;
import java.util.Optional;

@Getter
@Setter
public class TicketService {
    private SlotAllocationStrategy slotAllocationStrategy;
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingFloorRepository parkingFloorRepository;

    public TicketService(SlotAllocationStrategy slotAllocationStrategy,
                         GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingFloorRepository parkingFloorRepository){
        this.slotAllocationStrategy = slotAllocationStrategy;
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingFloorRepository = parkingFloorRepository;
    }

    public Ticket GenerateTicket(int gateId,
                                 String vehicleNumber,
                                 VehicleType vehicleType
    ) throws InvalidGateIdException, ParkingSlotNotAvailableException {
        Gate gate;
        Vehicle vehicle;
        ParkingFloor parkingFloor;
        //need to get Gate from gateId
        //find vehicle by number
        //find parking spot using strategy
        Optional<Gate> gateOptional = gateRepository.getGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new InvalidGateIdException("Invalid gateId");
        }

        gate = gateOptional.get();

        Optional<Vehicle> optionalVehicle = vehicleRepository.getVehicleByName(vehicleNumber);

        if(optionalVehicle.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle = vehicleRepository.save(vehicle);
        }
        else{
            vehicle = optionalVehicle.get();
        }

        Optional<ParkingFloor> optionalParkingFloor = parkingFloorRepository.getParkingFloorByGateId(gateId);

        parkingFloor = optionalParkingFloor.get();

        Optional<ParkingSlot> optionalParkingSlot = slotAllocationStrategy.allocateSlot(parkingFloor,vehicle,gate);

        if(optionalVehicle.isEmpty()){
            throw new ParkingSlotNotAvailableException("Parking Slot not available");
        }

        Ticket ticket = Ticket.getBuilder().setAssignedSlot(optionalParkingSlot.get())
                .setGeneratedAt(gate)
                .setVehicle(vehicle)
                .setEntryTime(new Date())
                .build();

        return ticket;
    }
}
