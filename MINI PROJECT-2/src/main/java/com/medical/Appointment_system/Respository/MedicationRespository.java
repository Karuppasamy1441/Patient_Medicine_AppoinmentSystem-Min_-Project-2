package com.medical.Appointment_system.Respository;

import com.medical.Appointment_system.Entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRespository extends JpaRepository<Medication,Long> {
}
