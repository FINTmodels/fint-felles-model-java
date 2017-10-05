// Built from tag v2.0.10

package no.fint.model.felles.basisklasser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Aktor;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public abstract class Enhet extends Aktor {
	private Adresse forretningsadresse;
	private String organisasjonsnavn;
	private Identifikator organisasjonsnummer;
	}

