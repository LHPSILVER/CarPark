package com.example.carparkproject.Repository;

import com.example.carparkproject.DTO.CarDTO;
import com.example.carparkproject.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,String> {
    @Query("SELECT c FROM Car c")
    List<Car> getAllCar();

    @Query("SELECT c FROM Car c WHERE c.licensePlate=:licensePlate")
    CarDTO getCarByLicensePlate(String licensePlate);
}
