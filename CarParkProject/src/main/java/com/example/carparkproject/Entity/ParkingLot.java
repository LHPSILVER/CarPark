package com.example.carparkproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "parkinglot")
public class ParkingLot implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "parkId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parkId;

    @Column(name = "parkArea")
    private int parkArea;

    @Column(name = "parkName")
    private String parkName;

    @Column(name = "parkPlace")
    private String parkPlace;

    @Column(name = "parkPrice")
    private int parkPrice;

    @Column(name = "parkStatus")
    private String parkStatus;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parkingLot")
    private List<Car> carList;

}
