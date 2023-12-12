package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.domain.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
