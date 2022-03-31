package com.example.carparkproject.DTO;

import com.example.carparkproject.Entity.Trip;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingOfficeDTO {
    private int officeId;

    private Date endContractDeadline;

    private String officeName;

    private String officePhone;

    private String officePlace;

    private int officePrice;

    private Date startContractDeadline;

    private Trip tripId;
}
