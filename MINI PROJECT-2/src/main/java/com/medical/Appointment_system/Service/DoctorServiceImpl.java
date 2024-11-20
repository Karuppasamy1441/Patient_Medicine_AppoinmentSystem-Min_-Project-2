package com.medical.Appointment_system.Service;

import com.medical.Appointment_system.Entity.Doctor;
import com.medical.Appointment_system.Respository.DoctorRepository;
import com.medical.Appointment_system.Service.Impl.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).get();
    }
}
