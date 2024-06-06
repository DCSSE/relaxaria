package manage.mentalcare.mtc.model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Patients")
public class Patient {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "patient_id")
        private Long id;

        @Column(name = "lt_name", length = 150)
        private String lastName;

        @Column(name = "ft_name", length = 150)
        private String firstName;

        @Column(name = "date_of_birth")
        private LocalDate dateOfBirth;

        @Column(name = "gender", length = 2)
        private String gender;

        @Column(name = "email", length = 100)
        private String email;

        @Column(name = "phone", length = 15)
        private String phone;

        @Column(name = "case_state", length = 255)
        private String caseState;

        public Long getId() {
            return id;
        }

        // Example of a setter
        public void setId(Long id) {
            this.id = id;
        }

}
