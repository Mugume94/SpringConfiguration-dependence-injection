package com.davs.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.davs.springdemo")
public class SportConfig {
	
	//define bean for our sad fortune service
	@Bean
	public FortuneService badFortuneService() {
		return new BadFortuneService();
	}
	
	
	//define bean for the swim coach and inject dependence
	
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		return new SwimCoach(badFortuneService());
	}
	
	
	 

}
