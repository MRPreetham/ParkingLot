package org.example.parkinglot.Controllers;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Exceptions.InvalidGateIdException;
import org.example.parkinglot.Exceptions.ParkingSlotNotAvailableException;
import org.example.parkinglot.Models.Ticket;
import org.example.parkinglot.Services.TicketService;
import org.example.parkinglot.dtos.GenerateTicketRequestDto;
import org.example.parkinglot.dtos.GenerateTicketResponseDto;
import org.example.parkinglot.dtos.ResponseStatus;
@Getter
@Setter
public class TicketController {
    private TicketService ticketService;
    private GenerateTicketResponseDto response;

    public TicketController(TicketService ticketService,
                            GenerateTicketResponseDto response){
        this.ticketService = ticketService;
        this.response = response;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
        Ticket ticket;

        try{
            ticket = ticketService.GenerateTicket(requestDto.getGateId(),
                    requestDto.getVehicleName(),requestDto.getVehicleType());
        } catch (ParkingSlotNotAvailableException e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage("ParkingSlot Not available");
            return response;
        } catch (InvalidGateIdException e) {
            response.setMessage("Invalid GateId");
            response.setResponseStatus(ResponseStatus.FAILURE);
           return response;
        }

        response.setAssignedSlot(ticket.getAssignedSlot());
        response.setResponseStatus(ResponseStatus.SUCCESS);

        return response;
    }
}
