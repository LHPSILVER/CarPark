package com.example.carparkproject.DTO;

import com.example.carparkproject.Entity.Car;
import com.example.carparkproject.Entity.Trip;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private int ticketId;

    private Time bookingTime;

    private String customerName;

    private Car licensePlate;

    private Trip tripId;
}
