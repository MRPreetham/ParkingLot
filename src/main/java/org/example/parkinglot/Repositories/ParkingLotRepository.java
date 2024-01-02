package org.example.parkinglot.Repositories;

import org.example.parkinglot.Models.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Integer,ParkingLot> parkingLotMap = new TreeMap<>();
    public Optional<ParkingLot> getParkingLotByGateId(int gateId){
        if(parkingLotMap.containsKey(gateId)){
            return Optional.of(parkingLotMap.get(gateId));
        }
        return Optional.empty();
    }
}
