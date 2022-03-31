package com.example.carparkproject.Service.ServiceImpl;

import com.example.carparkproject.DTO.BookingOfficeDTO;
import com.example.carparkproject.Entity.BookingOffice;
import com.example.carparkproject.Repository.BookingOfficeRepository;
import com.example.carparkproject.Service.BookingOfficeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingOfficeServiceImpl implements BookingOfficeService {

    private final BookingOfficeRepository bookingOfficeRepository;
    private final ModelMapper modelMapper;

    public BookingOfficeServiceImpl(BookingOfficeRepository bookingOfficeRepository, ModelMapper modelMapper) {
        this.bookingOfficeRepository = bookingOfficeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<BookingOfficeDTO> getAllBookingOffice() {
        return bookingOfficeRepository.getAllBookingOffice().stream().map(item -> modelMapper.map(item, BookingOfficeDTO.class)).collect(Collectors.toList());
    }

    @Override
    public BookingOfficeDTO addBookingOffice(BookingOfficeDTO bookingOfficeDTO) {
        BookingOffice bookingOffice = modelMapper.map(bookingOfficeDTO, BookingOffice.class);
        bookingOfficeRepository.save(bookingOffice);
        return bookingOfficeDTO;
    }

    @Override
    public BookingOfficeDTO getBookingOfficeById(int id) {
        BookingOfficeDTO bookingOfficeDTO =modelMapper.map(bookingOfficeRepository.getBookingOfficeByOfficeId(id),BookingOfficeDTO.class);
        return bookingOfficeDTO;
    }
}
