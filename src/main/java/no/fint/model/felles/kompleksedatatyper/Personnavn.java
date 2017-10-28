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
public class Personnavn implements FintComplexDatatypeObject {
	private String etternavn;
	private String fornavn;
	private String mellomnavn;
	}
