package org.example.parkinglot;

import org.example.parkinglot.Controllers.TicketController;
import org.example.parkinglot.Repositories.GateRepository;
import org.example.parkinglot.Repositories.ParkingFloorRepository;
import org.example.parkinglot.Repositories.VehicleRepository;
import org.example.parkinglot.Services.TicketService;
import org.example.parkinglot.Strategies.RandomSlotAllocationStrategy;
import org.example.parkinglot.Strategies.SlotAllocationStrategy;
import org.example.parkinglot.dtos.GenerateTicketResponseDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingLotApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParkingLotApplication.class, args);

		SlotAllocationStrategy slotAllocationStrategy = new RandomSlotAllocationStrategy();
		GateRepository gateRepository = new GateRepository();
		VehicleRepository vehicleRepository =  new VehicleRepository();
		ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();

		TicketService ticketService = new TicketService(slotAllocationStrategy,
				gateRepository,
				vehicleRepository,
				parkingFloorRepository);

		GenerateTicketResponseDto response = new GenerateTicketResponseDto();

		TicketController ticketController = new TicketController(ticketService,response);

		System.out.println("Application Started");
	}

}
