package com.davs.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Swimm 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
