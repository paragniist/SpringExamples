package com.tourplanner.test;

import java.time.LocalDate;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tourplanner.config.RootConfig;
import com.tourplanner.entities.BasicTrip;
import com.tourplanner.repositories.DeliveryAssociateRepository;
import com.tourplanner.repositories.ParcelRepository;
import com.tourplanner.repositories.TripRepository;
import com.tourplanner.service.TripService;

public class TourPlannerTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		TripService tripService = context.getBean(TripService.class);

//		TripDto tripDto = TripDto.builder().source("Hyderabad").destination("Jaipur").tripName("Jaipur Trip")
//				.plannedDate(LocalDate.of(2022, 10, 29)).estimatedCost(150000).days(7).build();
//		int tripNo = tripService.newTrip(tripDto);
//		System.out.println("tripNo : " + tripNo);
//		TripDto tripDto = tripService.findTrip(2);
//		System.out.println(tripDto);
		// tripService.deleteTrip(2);
		// tripService.getAllTrips().forEach(System.out::println);
		// tripService.getAllTrips(5, 1).forEach(System.out::println);
		// tripService.getTrips("days").forEach(System.out::println);
		TripRepository tripRepository = context.getBean(TripRepository.class);
		// tripRepository.findBySource("HYDERABAD").forEach(System.out::println);

		// tripRepository.findBySourceIgnoreCase("HYDERABAD").forEach(System.out::println);

		// tripRepository.findBySourceAndDestination("Hyderabad", "New
		// Delhi").forEach(System.out::println);

		// System.out.println("no of trips more than 10 days : " +
		// tripRepository.countByDaysGreaterThan(10));

		// tripRepository.findByEstimatedCostBetween(50000,
		// 200000).forEach(System.out::println);

		// tripRepository.findByPlannedDateAfter(LocalDate.of(2022, 9,
		// 30)).forEach(System.out::println);
//		tripRepository.findBySourceIn(Arrays.asList(new String[] { "Hyderabad", "Bombay" }))
//				.forEach(System.out::println);

		// tripRepository.findByTripNameLike("%a%").forEach(System.out::println);
		// tripRepository.findBySourceOrderByDays("Hyderabad").forEach(System.out::println);
		/*
		 * ParcelRepository parcelRepository = context.getBean(ParcelRepository.class);
		 * parcelRepository.getParcelsByDeliveryAssociate("paul").forEach(p -> {
		 * System.out.println(p.getDescription()); });
		 */

//		DeliveryAssociateRepository deliveryAssociateRepository = context.getBean(DeliveryAssociateRepository.class);
//		deliveryAssociateRepository.getDeliveryAssociatesByParcelWeight(50).forEach(da -> {
//			System.out.println(da.getFullname());
//		});

		/*
		 * int r = tripService.updateTrip(1, "Chennai", "Vijayawada");
		 * System.out.println("records : " + r);
		 */

		/*
		 * tripRepository.findByDaysGreaterThanEqual(5).forEach(e -> {
		 * System.out.println(e.getSource() + e.getDestination() + e.getDays()); });
		 */

//		tripRepository.findByEstimatedCostBetween(50000, 200000).forEach(e -> {
//			System.out.println(e.getFromSource() + " : " + e.getToDestination() + " : " + e.getVacationDays());
//		});

//		tripRepository.findByEstimatedCostGreaterThan(40000).forEach(e -> {
//			System.out.println(e.getSource() + " : " + e.getDestination() + " : " + e.getDays());
//		});

		tripRepository.findByTripNameLike("J%", BasicTrip.class).forEach(e -> {
			System.out.println(e.getSource() + " : " + e.getDestination() + " : " + e.getDays());
		});
	}
}
