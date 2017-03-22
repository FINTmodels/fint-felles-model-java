package no.fint.model.felles;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Person extends Aktor {
    private Identifikator fodselsnummer;
    private Personnavn navn;
    private String kjonn;
    private Date fodselsdato;
    private Adresse bostedsadresse;

    public Person(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator fodselsnummer, Personnavn navn, String kjonn, Date fodselsdato, Adresse bostedsadresse) {
        super(kontaktinformasjon, postadresse);
        this.fodselsnummer = fodselsnummer;
        this.navn = navn;
        this.kjonn = kjonn;
        this.fodselsdato = fodselsdato;
        this.bostedsadresse = bostedsadresse;
    }
}
