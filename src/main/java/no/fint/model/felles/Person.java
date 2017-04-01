package no.fint.model.felles;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Person extends Aktor implements FintModel {

    public enum Relasjonsnavn {
        PERSONALRESSURS,
        KJONN,
        STATSBORGERSKAP
    }

    private Identifikator fodselsnummer;
    private Personnavn navn;
    private Date fodselsdato;
    private Adresse bostedsadresse;
    private List<Relation> relasjoner;

    public Person(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator fodselsnummer, Personnavn navn, Date fodselsdato, Adresse bostedsadresse) {
        super(kontaktinformasjon, postadresse);
        this.fodselsnummer = fodselsnummer;
        this.navn = navn;
        this.fodselsdato = fodselsdato;
        this.bostedsadresse = bostedsadresse;
        this.relasjoner = new ArrayList<>();
    }
}
