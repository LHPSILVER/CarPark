package com.example.carparkproject.Service;

import com.example.carparkproject.DTO.ParkingLotDTO;
import java.util.List;

public interface ParkingLotService {
    List<ParkingLotDTO> getAllParkingLot();

    void addParkingLot(ParkingLotDTO parkingLotDTO);

    ParkingLotDTO getParkingLotById(int id);

    List<ParkingLotDTO> getParkingLotByParkPlace(String place);
}
