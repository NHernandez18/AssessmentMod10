package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Event;
import dmacc.beans.Performers;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Dec 11, 2023
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Event event() {
		Event bean = new Event();
		bean.setDate("1/1/2024");
		bean.setAttendeesAllowed(500);
		bean.setType("Music Concert");
		return bean;
	}
	
	@Bean
	public Performers performer () {
		Performers bean = new Performers("Selena Gomez", "Female", "Pineapple");
		return bean;
	}
}
