package com.example.carparkproject.Controller;

import com.example.carparkproject.DTO.CarDTO;
import com.example.carparkproject.Service.CarService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/listCar")
    public List<CarDTO> getAllCar(){
        return carService.getAllCar();
    }

    @PostMapping("/addCar")
    public void addCar(@RequestBody CarDTO carDTO){
        carService.addCar(carDTO);
    }

    @GetMapping("/findCarByLicensePlate")
    public CarDTO getCarByLicensePlate(@RequestParam String licensePlate){
        return carService.getCarByLicensePlate(licensePlate);
    }
}
