// Built from tag v2.2.0

package no.fint.model.felles.kompleksedatatyper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

@Data
@EqualsAndHashCode
@ToString
public class Kontaktinformasjon implements FintComplexDatatypeObject {
	private String epostadresse;
	private String mobiltelefonnummer;
	private String nettsted;
	private String sip;
	private String telefonnummer;
	}
