package com.hdfcbanking.controller.advice;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.hdfcbanking.exception.LoanNotSupportedException;

@ControllerAdvice
public class GlobalExceptionController {
	@Autowired
	private MessageSource messageSource;

	@ExceptionHandler
	public ModelAndView handleLoanNotSupportedException(LoanNotSupportedException e) {
		ModelAndView model = new ModelAndView();
		model.addObject("errorMessage", messageSource.getMessage("error.LoanNotSupported", null, Locale.getDefault()));
		model.setViewName("error");
		return model;
	}
}
