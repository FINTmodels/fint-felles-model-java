package no.fint.model.felles;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Person extends Aktor {
    private Identifikator foedselsnummer;
    private Personnavn navn;
    private String kjoenn;
    private Date foedselsdato;
    private String statsborgerskap;
    private Adresse bostedsadresse;
}
