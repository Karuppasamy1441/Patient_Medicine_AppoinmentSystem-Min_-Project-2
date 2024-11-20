package com.medical.Appointment_system.Controller;

import com.medical.Appointment_system.Entity.Appointment;
import com.medical.Appointment_system.Service.Impl.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class AppointmentController {

    private AppointmentService appointmentService;

    @GetMapping("viewAppointmentList")
    public String getAllAppointment(Model model){
        model.addAttribute("listOfAppointment",appointmentService.getAllAppointment());
        return "viewAppointmentList";
    }

    @PostMapping("/appointmentForm")
    public String saveAppointment(@ModelAttribute("appointment")Appointment appointment){
        appointmentService.bookAppointment(appointment);
        return "Successfully";
    }

}
