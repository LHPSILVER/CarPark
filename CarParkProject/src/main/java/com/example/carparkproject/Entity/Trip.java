package com.example.carparkproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "trip")
public class Trip implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "tripId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripId;

    @Column(name = "bookedTicketNumber")
    private int bookedTicketNumber;

    @Column(name = "carType")
    private String carType;

    @Column(name = "departureDate")
    private Date departureDate;

    @Column(name = "departureTime")
    private Time departureTime;

    @Column(name = "destination")
    private String destination;

    @Column(name ="driver")
    private String driver;

    @Column(name = "maximumOnlineTicketNumber")
    private int maxTicketNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "trip")
    private List<Ticket> ticketList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "trip")
    private List<BookingOffice> bookingOfficeList;
}
