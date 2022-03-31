package com.example.carparkproject.Service.ServiceImpl;

import com.example.carparkproject.DTO.CarDTO;
import com.example.carparkproject.Entity.Car;
import com.example.carparkproject.Repository.CarRepository;
import com.example.carparkproject.Service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    public CarServiceImpl(CarRepository carRepository, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addCar(CarDTO carDTO) {
        Car car = modelMapper.map(carDTO, Car.class);
        carRepository.save(car);
    }

    @Override
    public List<CarDTO> getAllCar() {
        return carRepository.getAllCar().stream().map(item->modelMapper.map(item,CarDTO.class)).collect(Collectors.toList());
    }

    @Override
    public CarDTO getCarByLicensePlate(String licensePlate) {
        return carRepository.getCarByLicensePlate(licensePlate);
    }
}
