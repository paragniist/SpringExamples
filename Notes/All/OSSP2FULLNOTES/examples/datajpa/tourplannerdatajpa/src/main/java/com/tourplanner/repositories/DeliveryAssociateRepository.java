package com.tourplanner.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tourplanner.entities.DeliveryAssociate;

public interface DeliveryAssociateRepository extends JpaRepository<DeliveryAssociate, Integer> {
	@Query("from DeliveryAssociate da inner join da.parcels parcel where parcel.weight >= ?1")
	List<DeliveryAssociate> getDeliveryAssociatesByParcelWeight(int weight);
}
