package org.example.parkinglot.Repositories;

import org.example.parkinglot.Models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Integer,Gate> gateMap = new TreeMap<>();
    public Optional<Gate> getGateById(int gateId){
        if(gateMap.containsKey(gateId)){
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }
}
