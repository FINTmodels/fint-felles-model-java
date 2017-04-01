package no.fint.model.felles;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
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

    public Person() {
        this.relasjoner = new ArrayList<>();
    }

    public Person(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator fodselsnummer, Personnavn navn, Date fodselsdato, Adresse bostedsadresse) {
        super(kontaktinformasjon, postadresse);
        this.fodselsnummer = fodselsnummer;
        this.navn = navn;
        this.fodselsdato = fodselsdato;
        this.bostedsadresse = bostedsadresse;
        this.relasjoner = new ArrayList<>();
    }

    @Override
    public String getId() {
        return getFodselsnummer().getIdentifikatorverdi();
    }

    @JsonIgnore
    @Override
    public void addRelasjon(Relation relation) {
        this.relasjoner.add(relation);
    }
}
