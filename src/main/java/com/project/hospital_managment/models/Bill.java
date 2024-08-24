package com.project.hospital_managment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bill {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long patientId;

    private double amount;

    private String status;

}
