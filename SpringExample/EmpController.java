package com.ust.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;




@Controller

public class EmpController {
	
	
	
	@Autowired    
	EmpDao dao;
	

	
	/*@RequestMapping("/hello")
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");

	      return "hello";
	   }*/
	
	@RequestMapping(value="/empform",method = RequestMethod.GET )
	public String showform(Model m){
		m.addAttribute("command",new Emp());
		return "empform";
	}
	
	
	
	
	@RequestMapping("/empform")
	public ModelAndView display() {
		ModelAndView view =new ModelAndView("empform");
		return view;
	}
	
	
	
	
	@RequestMapping(value="/save",method = RequestMethod.POST) 
	public String save(@ModelAttribute("emp") Emp emp){   
		System.out.println("I am here");
		 dao.save(emp);    
		 return "redirect:/viewemp";

		
	}
	
	@RequestMapping("/viewemp")    
	 public String viewemp(Model m){    
		   List<Emp> list=dao.getEmployees();    
		   m.addAttribute("list",list);  
		   return "viewemp";    
	}  
	

	  
	
	

	 /*
	  * @RequestMapping(value="/editemp/{id}", method= RequestMethod.GET)
	  * public String edit(@PathVariable (value="id")Integer id, Model m){    
		Emp emp=dao.getEmpById(id);    
		m.addAttribute("command",emp);  
		return "empeditform";    
	 }*/ 
	
	
	@RequestMapping(value="/editemp/{id}", method= RequestMethod.GET)
	public String showform1(Model m){
		m.addAttribute("command",new Emp());
		return "empeditform";
	}

	/*@RequestMapping(value="/editsave",method = RequestMethod.POST)
	public String edit(@RequestParam("emp")Integer id,Emp emp,BindingResult result, Model m) {
		 emp=dao.getEmpById(id);    
		m.addAttribute("command",emp);  
		return "empeditform";  
		
	}*/
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST) 
	public String editsave(@ModelAttribute("emp") Emp emp){   
		 dao.update(emp);    
		 return "redirect:/viewemp";
		  
	}
	
	     
	
	 /*@RequestMapping(value="/editsave",method = RequestMethod.POST);
	  * public String editsave(@ModelAttribute("emp")Emp emp,BindingResult result, Model m) {
		 dao.update(emp);    
		 return "redirect:/viewemp"; 
	 }*/
	 
	 
	 @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
	 public String delete(@PathVariable int id){    
		  dao.delete(id);    
		  return "redirect:/viewemp";    
	  }
		
	


	
	
}
