// Built from tag v1.1.0-rc3

package no.fint.model.felles.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Adresse {
	public enum Relasjonsnavn {
			LAND
	}

	private String adresse;
	private String postnummer;
	private String poststed;
	}

