package medical.center.api.controller;

import jakarta.validation.Valid;
import medical.center.api.domain.Patient;
import medical.center.api.model.patient.PatientModel;
import medical.center.api.domain.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patient")
public class patientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void insert(@RequestBody @Valid PatientModel data) {
        repository.save(new Patient(data));
    }
}
