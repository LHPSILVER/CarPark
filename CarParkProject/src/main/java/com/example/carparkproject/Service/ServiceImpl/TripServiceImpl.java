package com.example.carparkproject.Service.ServiceImpl;

import com.example.carparkproject.DTO.TripDTO;
import com.example.carparkproject.Entity.Trip;
import com.example.carparkproject.Repository.TripRepository;
import com.example.carparkproject.Service.TripService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripServiceImpl implements TripService {

    private final TripRepository tripRepository;
    private final ModelMapper modelMapper;

    public TripServiceImpl(TripRepository tripRepository, ModelMapper modelMapper) {
        this.tripRepository = tripRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addTrip(TripDTO tripDTO) {
        Trip trip = modelMapper.map(tripDTO, Trip.class);
        tripRepository.save(trip);
    }

    @Override
    public List<TripDTO> getAllTrip() {
        return tripRepository.getAllTrip().stream().map(item->modelMapper.map(item,TripDTO.class)).collect(Collectors.toList());
    }

    @Override
    public TripDTO getTripByTripId(Integer id) {
        TripDTO tripDTO = modelMapper.map(tripRepository.getTripByTripId(id),TripDTO.class);
        return tripDTO;
    }
}
