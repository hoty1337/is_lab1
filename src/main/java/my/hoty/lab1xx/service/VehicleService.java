package my.hoty.lab1xx.service;

import my.hoty.lab1xx.entity.FuelType;
import my.hoty.lab1xx.entity.Vehicle;

import java.util.List;
import java.util.Map;

public interface VehicleService {
    List<Vehicle> findAll();
    Vehicle findById(int id);
    void deleteById(int id);
    void deleteByFuelType(FuelType fuelType);
    Double calculateAverageFuelConsumption();
    Map<FuelType, Long> getCountByFuelType();
    List<Vehicle> findByEnginePowerRange(Float minPower, Float maxPower);
    void addWheels(Long vehicleId, Integer wheelsToAdd);
}
