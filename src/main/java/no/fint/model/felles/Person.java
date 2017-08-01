package no.fint.model.felles;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Aktor;
import no.fint.model.felles.basisklasser.iso.Sprak;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.relation.Identifiable;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class Person extends Aktor implements Identifiable {
    private Identifikator fodselsnummer;
    private Personnavn navn;
    private Date fodselsdato;
    private String bilde;
    private Adresse bostedsadresse;
    private Sprak malform;
    private Sprak morsmal;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getFodselsnummer().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        STATSBORGERSKAP,
        KJONN,
        ELEV
    }
}

