package com.example.carparkproject.Repository;

import com.example.carparkproject.DTO.TicketDTO;
import com.example.carparkproject.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {

    @Query("SELECT t FROM Ticket t WHERE t.ticketId=:id")
    TicketDTO getTicketByTicketId(Integer id);

    @Query("SELECT t FROM Ticket t")
    List<Ticket> getAllTicket();
}
