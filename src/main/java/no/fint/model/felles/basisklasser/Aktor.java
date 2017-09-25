// Built from tag v1.1.0-rc3

package no.fint.model.felles.basisklasser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.felles.kompleksedatatyper.Adresse;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Aktor {
	private Kontaktinformasjon kontaktinformasjon;
	private Adresse postadresse;
	}

