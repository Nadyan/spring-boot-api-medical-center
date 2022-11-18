package medical.center.api.model.doctor;

import medical.center.api.model.msc.Address;

public record Doctor(String name, String email, String crm, Specialty specialty, Address address) {
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