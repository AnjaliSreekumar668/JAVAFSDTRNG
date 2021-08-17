package com.ust.springboot;

import java.util.List;

public interface PatientService {
	List <Patient> getPatients();
	
	void savePatient(Patient pat);
	Patient getPatientById(long id);
	void deletePatientById(long id);
		
	

}
