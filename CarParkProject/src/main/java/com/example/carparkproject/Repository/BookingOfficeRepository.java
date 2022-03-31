package com.example.carparkproject.Repository;

import com.example.carparkproject.DTO.BookingOfficeDTO;
import com.example.carparkproject.Entity.BookingOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface BookingOfficeRepository extends JpaRepository<BookingOffice,Integer> {

    @Query("SELECT b from BookingOffice b")
    List<BookingOffice> getAllBookingOffice();

    @Query("SELECT b from BookingOffice  b WHERE b.officeId=:officeId")
    BookingOfficeDTO getBookingOfficeByOfficeId(Integer officeId);
}
