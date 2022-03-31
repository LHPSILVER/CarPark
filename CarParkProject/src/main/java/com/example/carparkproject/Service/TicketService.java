package com.example.carparkproject.Service;

import com.example.carparkproject.DTO.TicketDTO;
import java.util.List;

public interface TicketService {
    List<TicketDTO> getAllTicket();

    void addTicket(TicketDTO ticketDTO);

    TicketDTO getTicketByTicketId(Integer id);

}
