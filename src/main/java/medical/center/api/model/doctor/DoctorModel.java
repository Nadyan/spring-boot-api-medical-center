package medical.center.api.model.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import medical.center.api.model.msc.AddressModel;

public record DoctorModel(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String phone,
        @NotBlank @Pattern(regexp = "\\d{4,6}") String crm,
        @NotNull Specialty specialty,
        @NotNull @Valid AddressModel address) {
}

/*
{
	"name": "Nadyan Pscheidt",
	"email": "dr.nadyan@medicalcenter.com",
	"crm": "123456",
	"specialty": "orthopedics",
	"address": {
		"street": "Fist",
		"district": "District 9",
		"cep": "89288370",
		"city": "Rapture",
		"uf": "SC",
		"number": "42",
		"complement": "house"
	}
}
 */