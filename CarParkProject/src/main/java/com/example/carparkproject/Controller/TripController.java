package com.example.carparkproject.Controller;

import com.example.carparkproject.DTO.TripDTO;
import com.example.carparkproject.Service.TripService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/Trip")
public class TripController {
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping("/listTrip")
    public List<TripDTO> getAllTrip(){
        return tripService.getAllTrip();
    }

    @GetMapping("/getTripById")
    public TripDTO getTripById(@RequestParam Integer id){
        return tripService.getTripByTripId(id);
    }

    @PostMapping("/addTrip")
    public void addTrip(@RequestBody TripDTO tripDTO){
        tripService.addTrip(tripDTO);
    }
}
