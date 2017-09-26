// Built from tag v2.0.0

package no.fint.model.felles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Aktor;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Personnavn;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class Person extends Aktor {
    private String bilde;
    private Adresse bostedsadresse;
    private Date fodselsdato;
    private Identifikator fodselsnummer;
    private Personnavn navn;
    public enum Relasjonsnavn {
        STATSBORGERSKAP,
        KJONN,
        MALFORM,
        PERSONALRESSURS,
        MORSMAL,
        ELEV
    }
}

