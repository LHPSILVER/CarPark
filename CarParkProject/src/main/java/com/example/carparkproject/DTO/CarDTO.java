package com.example.carparkproject.DTO;

import com.example.carparkproject.Entity.ParkingLot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private String licensePlate;

    private String carColor;

    private String carType;

    private String company;

    List<TicketDTO> listTicket;

    private ParkingLot parkId;
}
