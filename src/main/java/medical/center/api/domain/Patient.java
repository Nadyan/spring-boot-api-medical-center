package medical.center.api.domain;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medical.center.api.model.patient.PatientModel;

@Table(name="patients")
@Entity(name="Patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Patient {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer healthCare;
    private String healthCareCode;
    private Integer age;
    private String email;
    private String phone;

    @Embedded
    private Address address;

    public Patient(PatientModel data) {
        this.name = data.name();
        this.healthCare = data.healthCare();
        this.healthCareCode = data.healthCareCode();
        this.age = data.age();
        this.email = data.email();
        this.phone = data.phone();
        this.address = new Address(data.address());
    }
}
