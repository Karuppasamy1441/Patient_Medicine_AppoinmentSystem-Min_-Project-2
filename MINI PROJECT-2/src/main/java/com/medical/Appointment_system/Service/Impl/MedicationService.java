package com.medical.Appointment_system.Service.Impl;

import com.medical.Appointment_system.Entity.Medication;

import java.util.List;

public interface MedicationService {
    List<Medication> allMedicine();

    void  saveMedication(Medication medication);

    Medication getMedicationById(Long id);

    void delete(Long id);
}
