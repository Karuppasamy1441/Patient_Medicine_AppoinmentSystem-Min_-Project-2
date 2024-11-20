package com.medical.Appointment_system.Service;

import com.medical.Appointment_system.Entity.Medication;
import com.medical.Appointment_system.Respository.MedicationRespository;
import com.medical.Appointment_system.Service.Impl.MedicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedicationServiceImpl implements MedicationService {
    private MedicationRespository medicationRespository;

    @Override
    public List<Medication> allMedicine() {
        return medicationRespository.findAll();
    }

    @Override
    public void saveMedication(Medication medication) {
        medicationRespository.save(medication);
    }

    @Override
    public Medication getMedicationById(Long id) {
        return medicationRespository.findById(id)
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
     medicationRespository.deleteById(id);
    }
}
