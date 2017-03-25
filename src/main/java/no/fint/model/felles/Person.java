package no.fint.model.felles;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Person extends Aktor {
    public static final String RELASJON_PERSON_PERSONALRESSURS = "urn:fint.no:person:personalressurs:person.fodselsnummer:personalressurs.ansattnummer";
    public static final String RELASJON_PERSON_KJONN = "urn:fint.no:person:kjonn:person.fodselsnummer:kjonn.systemid";
    public static final String RELASJON_PERSON_STATSBORGERSKAP = "urn:fint.no:person:statsborgerskap:person.fodselsnummer:statsborgerskap.systemid";

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
}
