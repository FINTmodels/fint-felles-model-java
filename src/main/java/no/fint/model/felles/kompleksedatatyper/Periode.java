// Built from tag v2.2.0

package no.fint.model.felles.kompleksedatatyper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import java.util.Date;

@Data
@EqualsAndHashCode
@ToString
public class Periode implements FintComplexDatatypeObject {
	private String beskrivelse;
	private Date slutt;
	private Date start;
	}
