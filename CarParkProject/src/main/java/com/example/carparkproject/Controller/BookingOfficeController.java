package com.example.carparkproject.Controller;

import com.example.carparkproject.DTO.BookingOfficeDTO;
import com.example.carparkproject.Service.BookingOfficeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/BookingOffice")
public class BookingOfficeController {

    private final BookingOfficeService bookingOfficeService;

    public BookingOfficeController(BookingOfficeService bookingOfficeService) {
        this.bookingOfficeService = bookingOfficeService;
    }

    @GetMapping("/listBookingOffice")
    public List<BookingOfficeDTO> getAllBookingOffice(){
        return bookingOfficeService.getAllBookingOffice();
    }

    @PostMapping("/addBookingOffice")
    public void addBookingOffice(@RequestBody BookingOfficeDTO bookingOfficeDTO){
        bookingOfficeService.addBookingOffice(bookingOfficeDTO);
    }

    @GetMapping("/findBookingOfficeById")
    public BookingOfficeDTO getBookingOfficeById(@RequestParam Integer id){
        return bookingOfficeService.getBookingOfficeById(id);
    }
}
