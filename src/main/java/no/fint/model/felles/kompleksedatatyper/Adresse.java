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
public class Adresse implements FintComplexDatatypeObject {
	public enum Relasjonsnavn {
			LAND
	}

	private List<String> adresselinje;
	private String postnummer;
	private String poststed;
	}
