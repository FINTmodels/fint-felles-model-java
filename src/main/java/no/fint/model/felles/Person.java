// Built from tag v1.1.0-rc2

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
    public enum Relasjonsnavn {
        STATSBORGERSKAP,
        KJONN,
        MALFORM,
        PERSONALRESSURS,
        MORSMAL,
        ELEV
    }

    private String bilde;
    private Adresse bostedsadresse;
    private Date fodselsdato;
    private Identifikator fodselsnummer;
    private Personnavn navn;
}

