package com.marriott.loyatly;

import java.util.HashMap;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * rule "Hello World"
    when
        m : Message( status == Message.HELLO, myMessage : message )
    then
        System.out.println( myMessage );
        m.setMessage( "Goodbye cruel world" );
        m.setStatus( Message.GOODBYE );
        update( m );
end

rule "GoodBye"
    when
        Message( status == Message.GOODBYE, myMessage : message )
    then
        System.out.println( myMessage );
end
 */
public class LoyaltyRulesTest {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			Booking booking= new Booking();
			booking.setNumOfKids(2);
			booking.setCorpCode("IBM");
			booking.setBookingDuration(62);
			booking.setState("FL");
			booking.setCity("MIAMI");
			kSession.insert(booking);
			kSession.fireAllRules();
			

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
