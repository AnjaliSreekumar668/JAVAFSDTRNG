package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ClinicalController {
	
	@Autowired
	PatientService patservice;
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	@GetMapping("/home")
	public String viewHomePage(Model model) {
		model.addAttribute("listPatients",patservice.getPatients());
		return "home";
		
	}
	@GetMapping("inspat")
	public String showPatientForm(Model model) {
		Patient pat= new Patient();
		model.addAttribute("pat",pat);
		return "inspat";
		
	}
	@PostMapping("/save")
	public String savePatient(@ModelAttribute("pat") Patient pat ) {
		patservice.savePatient(pat);
		return "redirect:/";
		
	}
@GetMapping("/showFormForUpdate/{id}")
	
	public String showUpdateForm(@PathVariable (value="id") long id, Model model) {
		Patient pat = patservice.getPatientById(id);
		model.addAttribute("pat",pat);
		return "update";
	} 
@GetMapping("/deletePatient/{id}")
	
	public String deleteForm(@PathVariable (value="id") long id) {
	Patient pat = patservice.getPatientById(id);
		this.patservice.deletePatientById(id);
		return "redirect:/";
	}
}
