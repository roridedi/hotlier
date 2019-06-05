package com.luxuryhotel.loyalty;

import java.util.HashMap;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoyaltyRuleService {

	@Autowired
	private KieContainer kContainer;

	public HashMap<String, HotelAmenity> determineAmenities(Booking booking, HashMap<String, HotelAmenity> amenities) {
		KieSession kieSession = kContainer.newKieSession();
		kieSession.setGlobal("amenities", amenities);
		kieSession.insert(booking);
		kieSession.fireAllRules();
		kieSession.dispose();
		return amenities;
	}
}