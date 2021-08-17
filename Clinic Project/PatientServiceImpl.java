package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRespository patrepo;

	@Override
	public List<Patient> getPatients() {
		return patrepo.findAll();
	}

	@Override
	public void savePatient(Patient pat) {
		this.patrepo.save(pat);
		
	}

	@Override
	public Patient getPatientById(long id) {
		
		Optional<Patient> optional = patrepo.findById(id);
		Patient pat = null;
		if (optional.isPresent()) {
			pat = optional.get();
		} else {
			throw new RuntimeException(" Patient not found for id :: " + id);
		}
		return pat;
	}

	

	@Override
	public void deletePatientById(long id) {
		this.patrepo.deleteById(id);
		
	}
	 

	
}
