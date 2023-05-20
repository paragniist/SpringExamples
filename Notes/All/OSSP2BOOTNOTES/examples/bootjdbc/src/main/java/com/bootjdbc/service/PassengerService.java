package com.bootjdbc.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootjdbc.dao.PassengerDao;
import com.bootjdbc.dto.PassengerDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PassengerService {
	private final PassengerDao passengerDao;

	@Transactional(readOnly = true)
	public List<PassengerDto> getPassengers() {
		return passengerDao.getPassengers().stream().map(bo -> {
			PassengerDto dto = new PassengerDto();
			BeanUtils.copyProperties(bo, dto);
			return dto;
		}).toList();
	}
}
