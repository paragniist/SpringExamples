package com.ordermgmt.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ordermgmt.dto.OrderDto;

@Controller
public class OrderMgmtController {
	// database
	private Map<Integer, OrderDto> orderMap;

	@PostConstruct
	public void init() {
		orderMap = new HashMap<Integer, OrderDto>();
		orderMap.put(10, OrderDto.builder().orderNo(10).description("iphone 13").orderedDate(LocalDate.of(2022, 7, 21))
				.customerName("Paul").status("accepted").amount(78000).build());
		orderMap.put(73, OrderDto.builder().orderNo(73).description("Sumsung 22S")
				.orderedDate(LocalDate.of(2022, 7, 22)).customerName("Marry").status("created").amount(68000).build());
		orderMap.put(30, OrderDto.builder().orderNo(30).description("Lightning Cabel")
				.orderedDate(LocalDate.of(2022, 7, 21)).customerName("Paul").status("created").amount(8000).build());
	}

	@RequestMapping(value = "/my-orders.htm", method = RequestMethod.GET)
	public String showMyOrders(ModelMap model) {
		List<OrderDto> orders = null;

		orders = orderMap.values().stream().toList();
		model.addAttribute("orders", orders);

		return "my-orders";
	}

	@RequestMapping(value = "/{orderNo}/order-details.htm", method = RequestMethod.GET)
	public String showOrderDetails(@PathVariable("orderNo") String orderNo, Model model) {
		OrderDto orderDto = null;

		orderDto = orderMap.get(Integer.parseInt(orderNo));
		model.addAttribute("order", orderDto);
		return "order-details";
	}
}
