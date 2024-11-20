package com.medical.Appointment_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="medicine")
public class Medication {
    @jakarta.persistence.Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String medicineName;

    private String dosage;

    private Long quentity;
}
