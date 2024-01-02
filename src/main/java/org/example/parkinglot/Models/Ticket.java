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
    private Gate gate;
    private Vehicle vehicle;

    private Ticket(Builder builder){
        this.ticketNumber = builder.getTicketNumber();
        this.entryTime = builder.getEntryTime();
        this.assignedSlot = builder.getAssignedSlot();
        this.gate = builder.getGate();
        this.vehicle = builder.getVehicle();
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    @Getter
    @Setter
    public static class Builder{
        private String ticketNumber;
        private Date entryTime;
        private ParkingSlot assignedSlot;
        private Gate gate;
        private Vehicle vehicle;
        private Builder(){}

        public Builder setTicketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
            return this;
        }

        public Builder setEntryTime(Date entryTime) {
            this.entryTime = entryTime;
            return this;
        }

        public Builder setAssignedSlot(ParkingSlot assignedSlot) {
            this.assignedSlot = assignedSlot;
            return this;
        }

        public Builder setGeneratedAt(Gate gate) {
            this.gate = gate;
            return this;
        }

        public Builder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Ticket build(){
            return new Ticket(this);
        }
    }

}
