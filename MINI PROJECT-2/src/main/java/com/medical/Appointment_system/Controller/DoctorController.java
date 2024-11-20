package com.medical.Appointment_system.Controller;

import com.medical.Appointment_system.Entity.Appointment;
import com.medical.Appointment_system.Entity.Doctor;
import com.medical.Appointment_system.Service.Impl.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class DoctorController {

    private DoctorService doctorService;

    @GetMapping("/viewDoctor")
    public String allDoctors(Model model){
        model.addAttribute("listOfDoctor",doctorService.getAllDoctor());
        return "viewDoctor";
    }

    @GetMapping("/doctorAppointment")
    public String bookAppointment(Model model){
        model.addAttribute("listOfDoctor",doctorService.getAllDoctor());
        return "doctorAppointment";
    }

    @GetMapping("/doctorBook/{id}")
    public String doctorAppointment(@PathVariable("id")Long id, Model model){
        Doctor doctor=doctorService.getDoctorById(id);
        Appointment appointment=new Appointment();
        appointment.setDoctor(doctor);
        appointment.setDoctor_name(doctor.getDoctorName());
        model.addAttribute("appointment",appointment);

        return "bookAppointment";
    }

}
