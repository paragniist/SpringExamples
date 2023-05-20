package com.ac.controller;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ac.dto.AppointmentDto;

public class BookAppointmentController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = null;
		AppointmentDto appointment = null;
		LocalDateTime appointmentDate = null;

		appointmentDate = LocalDateTime.parse(request.getParameter("appointmentDate"));
		appointment = new AppointmentDto();
		appointment.setAppointmentNo(new SecureRandom().nextInt(1000000));
		appointment.setPatientName(request.getParameter("patientName"));
		appointment.setDoctorName(request.getParameter("doctorName"));
		appointment.setAppointmentDate(appointmentDate);

		// store into database

		mav = new ModelAndView();
		mav.addObject("appointment", appointment);
		mav.setViewName("appointment-details");

		return mav;
	}

}
