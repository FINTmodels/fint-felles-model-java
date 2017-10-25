// Built from tag v2.0.10

package no.fint.model.felles.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Kontaktinformasjon {
	private String epostadresse;
	private String mobiltelefonnummer;
	private String nettsted;
	private String sip;
	private String telefonnummer;
	}
