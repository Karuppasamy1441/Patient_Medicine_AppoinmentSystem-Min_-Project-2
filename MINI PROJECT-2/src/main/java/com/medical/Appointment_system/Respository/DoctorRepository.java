package com.medical.Appointment_system.Respository;

import com.medical.Appointment_system.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository  extends JpaRepository<Doctor,Long> {
}
