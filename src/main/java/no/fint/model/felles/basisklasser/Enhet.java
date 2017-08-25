// Built from tag v1.1.0-rc2

package no.fint.model.felles.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class Enhet extends Aktor {
    private Adresse forretningsadresse;
    private String organisasjonsnavn;
    private Identifikator organisasjonsnummer;
}

