package org.example.parkinglot.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.Models.ParkingSlot;
@Getter
@Setter

public class GenerateTicketResponseDto {
    private ParkingSlot assignedSlot;
    private ResponseStatus responseStatus;
    private String message;
}
