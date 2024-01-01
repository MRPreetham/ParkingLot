package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends BaseModel{
    private String ticketNumber;
    private Date entryTime;
    private ParkingSlot assignedSlot;
    private Gate generatedAt;
    private Vehicle vehicle;

    public Ticket(Date entryTime,Vehicle vehicle){
        this.entryTime = entryTime;
        this.vehicle = vehicle;
    }
}
