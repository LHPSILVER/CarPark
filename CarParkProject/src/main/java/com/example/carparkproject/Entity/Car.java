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
@AllArgsConstructor
@NoArgsConstructor
@Table(name="car")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "licensePlate")
    private String licensePlate;

    @Column(name = "carColor")
    private String carColor;

    @Column(name = "carType")
    private String carType;

    @Column(name = "company")
    private String company;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "car")
    private List<Ticket> ticketList;

    @ManyToOne
    @JoinColumn(name="parkId",nullable = false)
    private ParkingLot parkingLot;
}
