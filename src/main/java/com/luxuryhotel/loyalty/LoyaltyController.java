package com.luxuryhotel.loyalty;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/rules")
@Api(value="loyalty-rules")
public class LoyaltyController {

	private static final Logger logger = LoggerFactory.getLogger(LoyaltyController.class);

	@Autowired
	private KieContainer kieContainer;

    @ApiOperation(value = "Retrieves A List Of Amenities Associated With A Booking",response = Iterable.class)
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/amenities")
	public Map<String, HotelAmenity> getAmenities(@RequestBody(required = true) Booking booking) {
		logger.info("Finding amenities list for " + booking);
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(booking);
		HashMap<String, HotelAmenity> amenities = new HashMap<String, HotelAmenity>();
		kieSession.setGlobal("amenities", amenities);
		kieSession.fireAllRules();
		kieSession.dispose();
		logger.info("Booking has an amenities list of " + amenities);
		return amenities;
	}

}
