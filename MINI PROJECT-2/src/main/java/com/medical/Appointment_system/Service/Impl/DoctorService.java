package com.medical.Appointment_system.Service.Impl;

import com.medical.Appointment_system.Entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctor();

    Doctor getDoctorById(Long id);
}
