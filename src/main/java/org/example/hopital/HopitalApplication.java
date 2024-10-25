package org.example.hopital;

import jakarta.annotation.PostConstruct;
import org.example.hopital.model.Patient;
import org.example.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication {

	@Autowired
	private PatientRepository patientRepository;


	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@PostConstruct
	public void init() {
		// Créer un patient
		Patient patient = new Patient();
		patient.setFirstName("John");
		patient.setLastName("Doe");
		patient.setGender("Male");
		patient.setAddress("20 Avenue Albert Einstein");
		patient.setCity("Villeurbanne");
		patient.setState("Villeurbanne");
		patient.setBirthCountry("France");
		patient.setBirthDate(new Date());
		patient.setPhone("0751054085");
		patient.setEmail("john.doe@example.com");
		patient.setUrgencyLevel(8);

		// Sauvegarder le patient dans la base de données
		patientRepository.save(patient);
	}
}
