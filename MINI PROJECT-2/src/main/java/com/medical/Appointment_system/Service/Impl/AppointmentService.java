package com.medical.Appointment_system.Service.Impl;

import com.medical.Appointment_system.Entity.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointment();

    void  bookAppointment(Appointment appointment);


}
