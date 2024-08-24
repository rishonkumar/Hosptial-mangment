package com.project.hospital_managment.service;

import com.project.hospital_managment.models.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PatientService {

    private static final Logger logger = Logger.getLogger(PatientService.class.getName());

    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<Patient>();

        logger.info("Getting all patients");
        return patients;

    }
}
