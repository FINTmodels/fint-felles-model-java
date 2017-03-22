package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Kontaktinformasjon {
    private String epostadresse;
    private String telefonnummer;
    private String mobiltelefonummer;
    private String nettsted;
    private String sip;
}
