// Built from tag v2.2.0

package no.fint.model.felles.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.felles.kompleksedatatyper.Adresse;

@Data
@EqualsAndHashCode
@ToString
public abstract class Aktor implements FintAbstractObject {
	private Kontaktinformasjon kontaktinformasjon;
	private Adresse postadresse;
	}
