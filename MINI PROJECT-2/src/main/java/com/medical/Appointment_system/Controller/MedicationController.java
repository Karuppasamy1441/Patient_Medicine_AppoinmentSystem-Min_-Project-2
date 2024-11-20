package com.medical.Appointment_system.Controller;

import com.medical.Appointment_system.Entity.Medication;
import com.medical.Appointment_system.Service.Impl.MedicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MedicationController {
    private MedicationService medicationService;

    @GetMapping("/viewMedication")
    public String hello(Model model){
        model.addAttribute("listOfMedication",medicationService.allMedicine());
        return "ViewMedication";
    }

    @GetMapping("addMedication")
    public String addpage(Model model){
        model.addAttribute("Medication",new Medication());
        return "addMedication";
    }
    @PostMapping("/addMedication")
    public String addMedication(@ModelAttribute("Medication") Medication medication){
        medicationService.saveMedication(medication);
        return "updatesuccess";
    }
    @PostMapping("/updateMedication")
    public String updateMedication(@ModelAttribute("Medication") Medication medication){
        medicationService.saveMedication(medication);
        return "updatesuccess";
    }

    @GetMapping("/updateMedication/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        Medication medication = medicationService.getMedicationById(id);
        if (medication != null) {
            model.addAttribute("Medication", medication);
            return "updateMedication";
        }
           return "ViewMedication";
    }

    @GetMapping("/deleteMedication/{id}")
    public String deleteMedication(@PathVariable("id") Long id, Model model) {
         medicationService.delete(id);
          model.addAttribute("message", "Medication with ID " + id + " has been deleted.");

        return "deleteMedication";
    }

}
