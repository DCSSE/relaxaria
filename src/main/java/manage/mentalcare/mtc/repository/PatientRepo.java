package manage.mentalcare.mtc.repository;

import manage.mentalcare.mtc.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepo extends PagingAndSortingRepository<Patient, Long> {

        // Find a patient by email
        Optional<Patient> findByEmail(String email);

        // Find patients by last name
        List<Patient> findByLastName(String lastName);

        // Find patients by gender
        List<Patient> findByGender(String gender);

        // Find patients born on or after a certain date
        List<Patient> findByDateOfBirthAfter(LocalDate date);

        // Find patients with a specific case state
        List<Patient> findByCaseState(String caseState);

        Page<Patient> findPatientsByLastNameContainingIgnoreCase(String lastName, Pageable pageable);
        void save(Patient patient);
        Optional<Patient> findById(Long id);

        void deleteById(Long id);
}
