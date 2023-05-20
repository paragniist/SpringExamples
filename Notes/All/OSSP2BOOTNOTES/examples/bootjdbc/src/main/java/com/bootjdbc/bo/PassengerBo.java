package com.bootjdbc.bo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class PassengerBo implements Serializable {
	private int passengerNo;
	private String fullname;
	private int age;
	private String gender;

}
