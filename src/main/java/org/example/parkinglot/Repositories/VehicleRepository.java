package org.example.parkinglot.Repositories;

import org.example.parkinglot.Enums.VehicleType;
import org.example.parkinglot.Models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private Map<String ,Vehicle> vehicleMap = new TreeMap<>();
    public Optional<Vehicle> getVehicleByName(String vehicleName){
        if(vehicleMap.containsKey(vehicleName)){
            return Optional.of(vehicleMap.get(vehicleName));
        }
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle){
        vehicleMap.put(vehicle.getVehicleNumber(),vehicle);
        return vehicleMap.get(vehicle.getVehicleNumber());
    }
}
