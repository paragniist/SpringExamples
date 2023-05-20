package com.springhibinteg.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class AddressDto {
	private int addressNo;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private int zip;
	private String country;
}
