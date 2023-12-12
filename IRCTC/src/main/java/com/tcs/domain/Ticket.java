package com.tcs.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Ticket_Tbl")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketId;
	@Column(name = "passenegerName")
	private String name;

	private String source;

	private String destination;

	private Integer noOfPassenegers;

	private Double price;

	private String status;

	@Column(name="travelingTime")
	private LocalTime time;
	
	@Column(name = "Traveling_Date")
	private LocalDate date;

}
