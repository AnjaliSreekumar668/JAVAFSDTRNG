package com.example.demo;

//import java.awt.Color;
import java.util.ArrayList;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employees")
public class RestResource {

	
	@RequestMapping("/employ")
	public Employees getColors()
	
	{
		List<Empp> employees = new ArrayList<>();
		Empp c1 = new Empp();
		c1.setId(1);
		c1.setName("Devika");
		c1.setEmail("devika@gmail.com");
		Empp c2 = new Empp();
		c2.setId(2);
		c2.setName("Feba");
		c2.setEmail("feba@gmail.com");
		
		employees.add(c1); employees.add(c2);
		
		Employees colorlist=new Employees(employees);
		
		return colorlist;
	}
	
	/*@RequestMapping("colors")
	public List<Color> getColors()
	{
		List<Color> colors = new ArrayList<>();
		
		Color c1 = new Color();
		c1.setId("Red");
		
		Color c2 = new Color();
		c2.setId("Blue");
		
		colors.add(c1); colors.add(c2);
		
		
		return colors;
	}*/
	
	
	/*@RequestMapping("cities1")
	public String getCities1()
	{
		
	
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<String> result = restTemplate.exchange(GET_CITIES_URL, HttpMethod.GET, entity, String.class); 
		System.out.println(result);
		
		return "hi";
		
	} */
	
	
	
}
