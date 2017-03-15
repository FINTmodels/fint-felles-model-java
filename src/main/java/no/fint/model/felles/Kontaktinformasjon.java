package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kontaktinformasjon {
    private String epostadresse;
    private String telefonnummer;
    private String mobiltelefonummer;
    private String nettsted;
}
