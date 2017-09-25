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
public class Kontaktinformasjon {
	private String epostadresse;
	private String mobiltelefonnummer;
	private String nettsted;
	private String sip;
	private String telefonnummer;
	}

