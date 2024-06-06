package manage.mentalcare.mtc.services;
import manage.mentalcare.mtc.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
//    Patient savePatient(Patient patient);
//    Optional<Patient> getPatientById(Long id);
//    List<Patient> getAllPatients();
    Patient updatePatient(Long id, Patient patient);
    void deletePatient(Long id);
}
