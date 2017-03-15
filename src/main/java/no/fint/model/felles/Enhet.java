package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Enhet extends Aktor {
    private Identifikator organisasjonsnummer;
    private String organisasjonsnavn;
    private Adresse forretningsadresse;
}
