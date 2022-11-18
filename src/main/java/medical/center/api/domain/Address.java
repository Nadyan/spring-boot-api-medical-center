package medical.center.api.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medical.center.api.model.msc.AddressModel;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String district;
    private String cep;
    private String city;
    private String uf;
    private Integer number;
    private String complement;

    public Address(AddressModel data) {
        this.street = data.street();
        this.district = data.district();
        this.cep = data.cep();
        this.city = data.city();
        this.uf = data.uf();
        this.number = data.number();
        this.complement = data.complement();
    }
}
