package com.example.carparkproject.Controller;

import com.example.carparkproject.DTO.TicketDTO;
import com.example.carparkproject.Service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Ticket")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/listTicket")
    public List<TicketDTO> getAllTicket(){
        return ticketService.getAllTicket();
    }

    @PostMapping("/addTicket")
    public void addTicket(@RequestBody TicketDTO ticketDTO){
        ticketService.addTicket(ticketDTO);
    }

    @GetMapping("/getTicketById")
    public TicketDTO getTicketByTicketId(@RequestParam Integer id){
        return ticketService.getTicketByTicketId(id);
    }
}
