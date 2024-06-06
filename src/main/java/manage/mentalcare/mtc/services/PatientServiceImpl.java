package manage.mentalcare.mtc.services;

import lombok.RequiredArgsConstructor;
import manage.mentalcare.mtc.model.Patient;
import manage.mentalcare.mtc.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
    @Autowired
    private final PatientRepo patientRepository;


    @Override
    public Patient updatePatient(Long id, Patient patient) {
        patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee Id:" + id));
        patientRepository.save(patient);
        return patient;
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
