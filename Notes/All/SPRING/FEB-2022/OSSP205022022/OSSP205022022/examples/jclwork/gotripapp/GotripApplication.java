package com.gotrip.main;

import com.gotrip.beans.TripAdvisor;
import java.util.*;

public class GotripApplication {
	public static void main(String[] args) {
		TripAdvisor tripAdvisor = new TripAdvisor();
		List<String> popularPlaces = tripAdvisor.getPopularPlaces("hyderabad");
		popularPlaces.stream().forEach(System.out::println);
	}
}