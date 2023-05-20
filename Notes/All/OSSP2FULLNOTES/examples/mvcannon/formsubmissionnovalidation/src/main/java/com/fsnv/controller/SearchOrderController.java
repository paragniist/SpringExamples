package com.fsnv.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fsnv.dto.OrderDto;
import com.fsnv.form.SearchOrderForm;

@Controller
public class SearchOrderController {
	@PostMapping("/do-search-order.htm")
	public String searchOrder(@ModelAttribute("searchOrderForm") SearchOrderForm orderForm, BindingResult errors,
			ModelMap model) {
		List<OrderDto> orderDtos = null;

		System.out.println(orderForm);
		orderDtos = Arrays.asList(new OrderDto[] {
				OrderDto.builder().orderNo("S93793").description("Iphone 13 pro max").status("delivered").build(),
				OrderDto.builder().orderNo("L838922").description("Kent Water purifier").status("in-transit").build(),
				OrderDto.builder().orderNo("L93837").description("LG 25kg Washing Machine").status("shipped")
						.build() });
		model.addAttribute("orders", orderDtos);
		return "search-order-results";
	}
}
