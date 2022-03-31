package com.example.carparkproject.Repository;

import com.example.carparkproject.DTO.ParkingLotDTO;
import com.example.carparkproject.Entity.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParkingLotRepository extends JpaRepository<ParkingLot,Integer> {
    @Query("SELECT p FROM ParkingLot p")
    List<ParkingLotDTO> getAllParkingLot();

    @Query("SELECT p FROM ParkingLot p WHERE p.parkId=:id")
    ParkingLotDTO getParkingLotByParkId(Integer id);

    @Query("SELECT p FROM ParkingLot p WHERE p.parkPlace=:place")
    List<ParkingLotDTO> getParkingLotByParkPlace(String place);
}
