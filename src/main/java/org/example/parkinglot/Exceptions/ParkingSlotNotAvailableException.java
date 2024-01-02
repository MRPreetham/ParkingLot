package org.example.parkinglot.Exceptions;

public class ParkingSlotNotAvailableException extends Exception{
    public ParkingSlotNotAvailableException(String message){
        super(message);
    }
}
