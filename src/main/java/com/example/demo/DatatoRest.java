package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController

public class DatatoRest {
	@RequestMapping("aliens")
	public List<Alien> getAliens()
	{
		
		List<Alien> aliens = new ArrayList<>();
		Alien a1 = new Alien();
		a1.setAid(1);
		a1.setAname("Atul");
		a1.setTech("Java");
		
		Alien a2 = new Alien();
		a2.setAid(2);
		a2.setAname("Avi");
		a2.setTech("Python");
		
		aliens.add(a1);
		aliens.add(a2);
		
		return aliens;	
	}
	
}
