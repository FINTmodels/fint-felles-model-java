package no.fint.model.felles.basisklasser;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.relation.Identifiable;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class Enhet extends Aktor implements Identifiable {
    private Identifikator organisasjonsnummer;
    private String organisasjonsnavn;
    private Adresse forretningsadresse;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getOrganisasjonsnummer().getIdentifikatorverdi();
    }
}

