package medical.center.api.model.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import medical.center.api.model.msc.AddressModel;

public record PatientModel(
        @NotBlank String name,
        @NotNull Integer healthCare,
        String healthCareCode,
        @NotNull Integer age,
        @NotNull String email,
        String phone,
        @NotNull @Valid AddressModel address) {
}
