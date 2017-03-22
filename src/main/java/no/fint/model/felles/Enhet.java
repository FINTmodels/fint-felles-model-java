package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Enhet extends Aktor {
    private Identifikator organisasjonsnummer;
    private String organisasjonsnavn;
    private Adresse forretningsadresse;

    public Enhet(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator organisasjonsnummer, String organisasjonsnavn, Adresse forretningsadresse) {
        super(kontaktinformasjon, postadresse);
        this.organisasjonsnummer = organisasjonsnummer;
        this.organisasjonsnavn = organisasjonsnavn;
        this.forretningsadresse = forretningsadresse;
    }
}
