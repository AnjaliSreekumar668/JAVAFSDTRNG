package com.ust.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;



import org.json.JSONObject;  
import org.json.JSONArray; 

@Controller
public class AController {
	
	
	@RequestMapping("/employees")
	public ModelAndView home1() {
		ModelAndView model=new ModelAndView("employees");
		
		//ModelAndView m=new ModelAndView("color");
		RestTemplate resttemplate=new RestTemplate();
		
		Employees result=resttemplate.getForObject("http://localhost:8085/employees/employ",Employees.class);
		System.out.println(result);
		//System.out.println(result.getColo());
		model.addObject("employees",result.getemp());
	
		return model;
		
		
	}
	/*@RequestMapping("/employees")
	public String home2() {
		
		
		
		RestTemplate resttemplate=new RestTemplate();
	
		Employees result=resttemplate.getForObject("http://localhost:8085/employees/employ",Employees.class);
		System.out.println(result);
		
		
	
		if(result.getemp().get(1).id==1) {
			return "you wont login";
		}
		return "please take care";
		
		
	}*/
	
	
	
	}

