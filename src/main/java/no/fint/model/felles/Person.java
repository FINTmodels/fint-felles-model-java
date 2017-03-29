package no.fint.model.felles;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.iso.Kjonn;
import no.fint.model.relation.Identifiable;
import no.fint.model.relation.Relation;
import no.fint.model.relation.RelationType;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Person extends Aktor implements FintModel { // Relations (getRelations())

    public static enum Relasjonsnavn {
        PERSONALRESSURS,
        KJONN,
        STATSBORGERSKAP
    }

    public static final String BASE = "https://api.felleskomponent.no/administrasjon/personal";

    private Identifikator fodselsnummer;
    private Personnavn navn;
    private Date fodselsdato;
    private Adresse bostedsadresse;
    private List<Relation> relasjoner; // Relation.for(Person.Relasjonsnavn.PERSONALRESSURS).fromBase(BASE_URL).path("/personalressurs")
                                        // Relation.for(Person.Relasjonsnavn.PERSONALRESSURS).link("http://localhost/personalressurs")

    public Person(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator fodselsnummer, Personnavn navn, Date fodselsdato, Adresse bostedsadresse) {
        super(kontaktinformasjon, postadresse);
        this.fodselsnummer = fodselsnummer;
        this.navn = navn;
        this.fodselsdato = fodselsdato;
        this.bostedsadresse = bostedsadresse;
    }

    public List<Relation> getRelations() {
        return relasjoner;
    }
}
