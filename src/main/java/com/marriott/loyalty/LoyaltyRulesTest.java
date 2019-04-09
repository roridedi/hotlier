package com.marriott.loyalty;

import java.util.HashMap;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * rule "Hello World" when m : Message( status == Message.HELLO, myMessage :
 * message ) then System.out.println( myMessage ); m.setMessage( "Goodbye cruel
 * world" ); m.setStatus( Message.GOODBYE ); update( m ); end
 * 
 * rule "GoodBye" when Message( status == Message.GOODBYE, myMessage : message )
 * then System.out.println( myMessage ); end
 */
public class LoyaltyRulesTest {

//	public static final void main(String[] args) {
//		try {
//			// load up the knowledge base
//			KieServices ks = KieServices.Factory.get();
//			KieContainer kContainer = ks.getKieClasspathContainer();
//			KieSession kSession = kContainer.newKieSession("ksession-rules");
//
//			Booking booking = new Booking();
//			booking.setNumOfKids(2);
//			booking.setCorpCode("IBM");
//			booking.setBookingDuration(2);
//			booking.setState("FL");
//			booking.setCity("MIAMI");
//
//			kSession.insert(booking);
//			kSession.fireAllRules();
//			kSession.dispose();
//
//
//		} catch (Throwable t) {
//			t.printStackTrace();
//		}
//	}
	

//	@Test
//	public void whenNightSurchargeFalseAndDistLessThan10_thenFixWithoutNightSurcharge() {
//		Booking booking = new Booking();
//		booking.setNumOfKids(2);
//		booking.setCorpCode("IBM");
//		booking.setBookingDuration(2);
//		booking.setState("FL");
//		booking.setCity("MIAMI");
//		HashMap<String,HotelAmenity> amenities= new  HashMap<>();
//		service.determineAmenities(booking, amenities);
////		assertNotNull(totalCharge);
////		assertEquals(Long.valueOf(70), totalCharge);
//	}
	
	public static void main(String[] args) {
//		@Autowired
//		private LoyaltyRuleService service;
//		Booking booking = new Booking();
//		booking.setNumOfKids(2);
//		booking.setCorpCode("IBM");
//		booking.setBookingDuration(2);
//		booking.setState("FL");
//		booking.setCity("MIAMI");
//		HashMap<String,HotelAmenity> amenities= new  HashMap<>();
//		service.determineAmenities(booking, amenities);
	}

}
