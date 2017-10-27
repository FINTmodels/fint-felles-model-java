// Built from tag v2.2.0

package no.fint.model.felles.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Aktor;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public abstract class Enhet extends Aktor implements FintAbstractObject {
	private Adresse forretningsadresse;
	private String organisasjonsnavn;
	private Identifikator organisasjonsnummer;
	}
