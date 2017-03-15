package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Aktor {
    private Kontaktinformasjon kontaktinformasjon;
    private Adresse postadresse;
}
