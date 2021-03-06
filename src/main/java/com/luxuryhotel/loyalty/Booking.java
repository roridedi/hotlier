package com.luxuryhotel.loyalty;

import java.util.HashMap;

public class Booking {
	private String bookingId;
	private String city;
	private String isAirport;
	private String airportCode;
	private int numOfKids;
	private int bookingDuration;
	private int numOfAdults;
	private HashMap<String, HotelAmenity> hotelAmenity;
	private String corpCode;
	private String state;
	private String hotelCode;
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIsAirport() {
		return isAirport;
	}

	public void setIsAirport(String isAirport) {
		this.isAirport = isAirport;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public int getNumOfKids() {
		return numOfKids;
	}

	public void setNumOfKids(int numOfKids) {
		this.numOfKids = numOfKids;
	}

	public int getNumOfAdults() {
		return numOfAdults;
	}

	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
	}

	public String getCorpCode() {
		return corpCode;
	}

	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public int getBookingDuration() {
		return bookingDuration;
	}

	public void setBookingDuration(int bookingDuration) {
		this.bookingDuration = bookingDuration;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public Booking() {
		
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public HashMap<String, HotelAmenity> getHotelAmenity() {
		return hotelAmenity;
	}

	public void setHotelAmenity(HashMap<String, HotelAmenity> hotelAmenity) {
		this.hotelAmenity = hotelAmenity;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", city=" + city + ", isAirport=" + isAirport + ", airportCode="
				+ airportCode + ", numOfKids=" + numOfKids + ", bookingDuration=" + bookingDuration + ", numOfAdults="
				+ numOfAdults + ", hotelAmenity=" + hotelAmenity + ", corpCode=" + corpCode + ", state=" + state
				+ ", hotelCode=" + hotelCode + "]";
	}


}
