package com.zomota.controller;

import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zomota.dto.BookingDto;
import com.zomota.form.BookTableForm;
import com.zomota.validator.BookTableFormValidator;

@Controller
@RequestMapping("/bookTable.htm")
public class BookTableController {
	@Autowired
	private BookTableFormValidator bookTableFormValidator;

	/*
	 * @InitBinder public void initBinder(WebDataBinder webDataBinder) {
	 * webDataBinder.addValidators(bookTableFormValidator); }
	 */

	@GetMapping
	public String showBookTableForm(ModelMap model) {
		BookTableForm bookTableForm = new BookTableForm();
		model.addAttribute("bookTableForm", bookTableForm);
		return "booktable";
	}

	@PostMapping
	public String bookTable(@ModelAttribute("bookTableForm") @Valid BookTableForm bookTableForm, BindingResult errors,
			ModelMap model) {
		BookingDto bookingDto = null;

		if (bookTableFormValidator.supports(bookTableForm.getClass())) {
			bookTableFormValidator.validate(bookTableForm, errors);
		}

		if (errors.hasErrors()) {
			return "booktable";
		}
		bookingDto = BookingDto.builder().referenceNo(UUID.randomUUID().toString().substring(0, 7))
				.restaurantName(bookTableForm.getRestaurantName()).bookingDate(bookTableForm.getReservationDate())
				.timeslot(bookTableForm.getTimeslot()).coupon(bookTableForm.getCoupon()).contactPerson("Paul")
				.contactNo("9739789032").build();

		model.addAttribute("booking", bookingDto);

		return "tabledetails";
	}

	@ModelAttribute("restaurants")
	public Properties populateRestaurants() throws IOException {
		Properties restaurantProperties = null;

		restaurantProperties = new Properties();
		restaurantProperties.load(this.getClass().getClassLoader().getResourceAsStream("restaurants.properties"));

		return restaurantProperties;
	}

}
