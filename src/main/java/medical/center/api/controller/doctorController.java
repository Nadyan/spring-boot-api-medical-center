package medical.center.api.controller;

import jakarta.validation.Valid;
import medical.center.api.domain.Doctor;
import medical.center.api.domain.DoctorRepository;
import medical.center.api.model.doctor.DoctorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class doctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void insert(@RequestBody @Valid DoctorModel data) {
        repository.save(new Doctor(data));
    }

}
