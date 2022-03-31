package com.example.carparkproject.Service.ServiceImpl;

import com.example.carparkproject.DTO.TicketDTO;
import com.example.carparkproject.Entity.Ticket;
import com.example.carparkproject.Repository.TicketRepository;
import com.example.carparkproject.Service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final ModelMapper modelMapper;

    public TicketServiceImpl(TicketRepository ticketRepository, ModelMapper modelMapper) {
        this.ticketRepository = ticketRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<TicketDTO> getAllTicket() {
        return ticketRepository.getAllTicket().stream().map(item->modelMapper.map(item,TicketDTO.class)).collect(Collectors.toList());
    }

    @Override
    public void addTicket(TicketDTO ticketDTO) {
        Ticket ticket = modelMapper.map(ticketDTO, Ticket.class);
        ticketRepository.save(ticket);
    }

    @Override
    public TicketDTO getTicketByTicketId(Integer id) {
        TicketDTO ticketDTO = modelMapper.map(ticketRepository.getTicketByTicketId(id),TicketDTO.class);
        return ticketDTO;
    }
}
