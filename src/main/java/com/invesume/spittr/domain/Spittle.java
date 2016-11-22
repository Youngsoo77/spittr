package com.invesume.spittr.domain;

import java.util.Date;

public class Spittle {
	
	private final Long id;
	private final String message;
	private final Date time;
	
	private Double latitude;
	private Double longitide;
	
	public Spittle(String message, Date time){
		this(message, time, null, null);
	}
	
	public Spittle(String message, Date time, Double longitide, Double latitude){
		this.id = null;
		this.message = message;
		this.time = time;
		this.longitide = longitide;
		this.latitude = latitude;
	}
	
	
}
