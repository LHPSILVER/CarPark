package com.example.carparkproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ticket")
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ticketId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;

    @Column(name = "bookingTime")
    private Time bookingTime;

    @Column(name = "customerName")
    private String customerName;

    @ManyToOne
    @JoinColumn(name="licensePlate",nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "tripId",nullable = false)
    private Trip trip;
}
