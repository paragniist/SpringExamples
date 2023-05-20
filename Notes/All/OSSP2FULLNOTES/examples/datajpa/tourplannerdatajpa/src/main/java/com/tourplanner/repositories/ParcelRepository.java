package com.tourplanner.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tourplanner.entities.Parcel;

public interface ParcelRepository extends JpaRepository<Parcel, Integer> {
	@Query(value = "from Parcel p where p.deliveryAssociate.fullname = ?1")
	List<Parcel> getParcelsByDeliveryAssociate(String deliveryAssociateName);
}
