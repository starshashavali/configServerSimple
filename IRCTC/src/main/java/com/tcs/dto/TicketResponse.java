package com.tcs.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketResponse {

	private Integer ticketId;

	private String name;

	private String source;

	private String destination;

	private Integer noOfPassenegers;

	private Double price;

	private String status;

	private LocalTime time;

	private LocalDate date;

}
