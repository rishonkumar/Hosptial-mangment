package com.project.hospital_managment.controller;


import com.project.hospital_managment.models.Patient;
import com.project.hospital_managment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }


}
