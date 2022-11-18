package medical.center.api.model.msc;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record AddressModel(
        @NotBlank String street,
        @NotBlank String district,
        @NotBlank @Pattern(regexp = "\\d{8}") String cep,
        @NotBlank String city,
        @NotBlank String uf,
        Integer number,
        String complement) {

}
