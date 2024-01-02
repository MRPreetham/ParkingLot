package org.example.parkinglot.Repositories;

import org.example.parkinglot.Models.ParkingFloor;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingFloorRepository {
    Map<Integer,ParkingFloor> parkingFloorMap = new TreeMap<>();
    public Optional<ParkingFloor> getParkingFloorByGateId(int gateId){
        if(parkingFloorMap.containsKey(gateId)){
            return Optional.of(parkingFloorMap.get(gateId));
        }
        return Optional.empty();
    }
}
