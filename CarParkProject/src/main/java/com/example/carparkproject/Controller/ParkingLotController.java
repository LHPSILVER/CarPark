package com.example.carparkproject.Controller;

import com.example.carparkproject.DTO.ParkingLotDTO;
import com.example.carparkproject.Service.ParkingLotService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ParkingLot")
public class ParkingLotController {
    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @GetMapping("/listParkingLot")
    public List<ParkingLotDTO> listParkingLot(){
        return parkingLotService.getAllParkingLot();
    }

    @GetMapping("/getParkingLotById")
    public ParkingLotDTO getParkingLotById(@RequestParam Integer id){
        return parkingLotService.getParkingLotById(id);
    }

    @GetMapping("/listParkingLotByPlace")
    public List<ParkingLotDTO> getParkingLotByPlace(@RequestParam String place){
        return parkingLotService.getParkingLotByParkPlace(place);
    }

    @PostMapping("/addParkingLot")
    public void addParkingLot(@RequestBody ParkingLotDTO parkingLotDTO){
        parkingLotService.addParkingLot(parkingLotDTO);
    }
}
