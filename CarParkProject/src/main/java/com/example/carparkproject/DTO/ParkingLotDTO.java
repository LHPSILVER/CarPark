package com.example.carparkproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLotDTO {
    private int parkId;

    private int parkArea;

    private String parkName;

    private String parkPlace;

    private int parkPrice;

    private String parkStatus;

    List<CarDTO> listCar;
}
