package com.example.carparkproject.Service;

import com.example.carparkproject.DTO.BookingOfficeDTO;
import java.util.List;

public interface BookingOfficeService {

    List<BookingOfficeDTO> getAllBookingOffice();

    BookingOfficeDTO addBookingOffice(BookingOfficeDTO bookingOfficeDTO);

    BookingOfficeDTO getBookingOfficeById(int id);

}
