package no.fint.model.felles;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.iso.Kjonn;
import no.fint.model.relation.Identifiable;
import no.fint.model.relation.RelationType;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Person extends Aktor implements Identifiable {
    public static final String REL_ID_PERSONALRESSURS = new RelationType.Builder()
            .namespace("fint.no").relationName("personalressurs").main(Person.class, "fodselsnummer").relatedId("personalressurs.ansattnummer").buildTypeString();

    public static final String REL_ID_KJONN = new RelationType.Builder()
            .namespace("fint.no").relationName("kjonn").main(Person.class, "fodselsnummer").related(Kjonn.class, "systemid").buildTypeString();

    public static final String REL_ID_STATSBORGERSKAP = new RelationType.Builder()
            .namespace("fint.no").relationName("statsborgerskap").main(Person.class, "fodselsnummer").relatedId("statsborgerskap.systemid").buildTypeString();

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
        return this.getFodselsnummer().getIdentifikatorverdi();
    }
}
