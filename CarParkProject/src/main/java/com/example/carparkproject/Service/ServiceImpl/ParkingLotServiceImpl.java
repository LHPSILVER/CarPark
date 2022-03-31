package com.example.carparkproject.Service.ServiceImpl;

import com.example.carparkproject.DTO.ParkingLotDTO;
import com.example.carparkproject.Entity.ParkingLot;
import com.example.carparkproject.Repository.ParkingLotRepository;
import com.example.carparkproject.Service.ParkingLotService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    private final ParkingLotRepository parkingLotRepository;
    private final ModelMapper modelMapper;

    public ParkingLotServiceImpl(ParkingLotRepository parkingLotRepository, ModelMapper modelMapper) {
        this.parkingLotRepository = parkingLotRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ParkingLotDTO> getAllParkingLot() {
        return parkingLotRepository.getAllParkingLot().stream().map(item->modelMapper.map(item,ParkingLotDTO.class)).collect(Collectors.toList());
    }

    @Override
    public void addParkingLot(ParkingLotDTO parkingLotDTO) {
        ParkingLot parkingLot = modelMapper.map(parkingLotDTO, ParkingLot.class);
        parkingLotRepository.save(parkingLot);
    }

    @Override
    public ParkingLotDTO getParkingLotById(int id) {
        ParkingLotDTO parkingLotDTO =modelMapper.map(parkingLotRepository.getParkingLotByParkId(id),ParkingLotDTO.class);
        return parkingLotDTO;
    }

    @Override
    public List<ParkingLotDTO> getParkingLotByParkPlace(String place) {
        return parkingLotRepository.getParkingLotByParkPlace(place).stream().map(item->modelMapper.map(item,ParkingLotDTO.class)).collect(Collectors.toList());
    }
}
