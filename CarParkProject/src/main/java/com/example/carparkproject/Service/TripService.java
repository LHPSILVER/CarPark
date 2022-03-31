package com.example.carparkproject.Service;

import com.example.carparkproject.DTO.TripDTO;
import java.util.List;

public interface TripService {

    void addTrip(TripDTO tripDTO);

    List<TripDTO> getAllTrip();

    TripDTO getTripByTripId(Integer id);
}
