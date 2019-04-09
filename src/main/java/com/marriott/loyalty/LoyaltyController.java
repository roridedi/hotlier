package com.marriott.loyalty;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/rules")
public class LoyaltyController {

	@Autowired
	private KieContainer kieContainer;

	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/amenities")
	public Map<String, HotelAmenity> getAmenities(@RequestBody(required = true) Booking booking) {

		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(booking);
		HashMap<String, HotelAmenity> amenities = new HashMap<String, HotelAmenity>();
		kieSession.setGlobal("amenities", amenities);
		kieSession.fireAllRules();
		kieSession.dispose();
		return amenities;
	}
}
