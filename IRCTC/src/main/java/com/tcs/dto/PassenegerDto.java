package com.tcs.dto;

import lombok.Data;

@Data
public class PassenegerDto {

	private String name;

	private String source;

	private String destination;

	private Integer noOfPassenegers;

	private Double price;

}
