package com.example.carparkproject.Service;

import com.example.carparkproject.DTO.CarDTO;
import java.util.List;

public interface CarService {

    void addCar(CarDTO carDTO);

    List<CarDTO> getAllCar();

    CarDTO getCarByLicensePlate(String licensePlate);
}
