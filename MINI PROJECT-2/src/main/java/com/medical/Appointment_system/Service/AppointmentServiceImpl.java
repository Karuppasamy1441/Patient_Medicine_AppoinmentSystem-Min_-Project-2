package com.medical.Appointment_system.Service;

import com.medical.Appointment_system.Entity.Appointment;
import com.medical.Appointment_system.Respository.AppointmentRepository;
import com.medical.Appointment_system.Service.Impl.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;


    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public void bookAppointment(Appointment appointment) {
          appointmentRepository.save(appointment);
    }
}
