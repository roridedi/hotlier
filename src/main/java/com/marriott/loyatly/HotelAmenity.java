package com.marriott.loyatly;

public enum HotelAmenity {
	FAMILY_TRAVEL(1), FREE_BREAKFAST(2), POOL(3), BUSINESS_CENTER(4), FREE_HIGH_SPEED_INTERNET(5),
	RESTAURANT_ON_SITE(6), KITCHEN_KITCHENETTE(7), EXTENDED_STAY(8), CAR_RENTAL_DESK(9), BEACH(10), GOLF(11),
	PETS_WELCOME(12), PARKING(13), RESORT(14), AIRPORT_SHUTTLE(15);

	private final int amenityCode;

	HotelAmenity(final int code) {

		amenityCode = code;
	}

	public int getAmenityCode() {

		return amenityCode;
	}
	
	
}
