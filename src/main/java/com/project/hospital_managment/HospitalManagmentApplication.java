package com.project.hospital_managment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HospitalManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagmentApplication.class, args);
	}

}
