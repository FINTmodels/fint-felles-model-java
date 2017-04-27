package no.fint.model.felles;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.relation.Identifiable;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Person extends Aktor implements Identifiable {
    public enum Relasjonsnavn {
        STATSBORGERSKAP,
        KJONN,
        PERSONALRESSURS
    }

    private Identifikator fodselsnummer;
    private Personnavn navn;
    private Date fodselsdato;
    private Adresse bostedsadresse;

    public Person(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator fodselsnummer, Personnavn navn, Date fodselsdato, Adresse bostedsadresse) {
        super(kontaktinformasjon, postadresse);
        this.fodselsnummer = fodselsnummer;
        this.navn = navn;
        this.fodselsdato = fodselsdato;
        this.bostedsadresse = bostedsadresse;
    }

    @JsonIgnore
    @Override
    public String getId() {
        return getFodselsnummer().getIdentifikatorverdi();
    }
}
