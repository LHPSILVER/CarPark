package com.example.carparkproject.Repository;

import com.example.carparkproject.DTO.TripDTO;
import com.example.carparkproject.Entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip,Integer> {

    @Query("SELECT t from Trip t")
    List<Trip> getAllTrip();

    @Query("SELECT t from Trip t WHERE t.tripId=:id")
    TripDTO getTripByTripId(Integer id);

}
