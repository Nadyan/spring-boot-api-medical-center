package medical.center.api.controller;

import medical.center.api.model.doctor.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class doctorController {

    @PostMapping
    public String insert(@RequestBody Doctor data) {
        return "Doctor " + data.name() + " inserted.";
    }

}
