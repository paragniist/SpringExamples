package com.jbvspringmvc.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class OpenAccountForm {
	@NotBlank
	@Length(min = 10, max = 12)
	private String mobileNo;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@Email
	private String emailAddress;
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	@NotBlank
	private String gender;
	@NotBlank
	@Length(min = 10, max = 10)
	private String panNo;
}
