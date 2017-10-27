// Built from tag v2.2.0

package no.fint.model.felles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Adresse;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.felles.basisklasser.Aktor;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Person extends Aktor implements FintMainObject {
	public enum Relasjonsnavn {
			STATSBORGERSKAP,
			KJONN,
			MALFORM,
			PERSONALRESSURS,
			MORSMAL,
			ELEV
	}

	private String bilde;
	private Adresse bostedsadresse;
	private Date fodselsdato;
	private Identifikator fodselsnummer;
	private Personnavn navn;
	}
