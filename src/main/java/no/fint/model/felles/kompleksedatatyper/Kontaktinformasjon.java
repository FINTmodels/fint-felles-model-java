package no.fint.model.felles.kompleksedatatyper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Kontaktinformasjon {
    private String epostadresse;
    private String telefonnummer;
    private String mobiltelefonnummer;
    private String nettsted;
    private String sip;
}

