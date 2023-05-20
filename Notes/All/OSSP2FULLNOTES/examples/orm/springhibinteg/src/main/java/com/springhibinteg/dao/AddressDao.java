package com.springhibinteg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springhibinteg.entities.Address;

@Repository
public class AddressDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int saveAddress(Address address) {
		int addressNo = (int) hibernateTemplate.save(address);
		return addressNo;
	}

	public Address getAddress(int addressNo) {
		return hibernateTemplate.get(Address.class, addressNo);
	}

	public List<Address> findAddressByCity(String city) {
		return (List<Address>) hibernateTemplate.findByNamedParam("from Address address where address.city=:city",
				"city", city);
	}
}
