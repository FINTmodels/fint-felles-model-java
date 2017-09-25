// Built from tag v1.1.0-rc3

package no.fint.model.felles.basisklasser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Aktor;

@Data
@EqualsAndHashCode(callSuper=false)
public abstract class Enhet extends Aktor {
	private Adresse forretningsadresse;
	private String organisasjonsnavn;
	private Identifikator organisasjonsnummer;
	}

