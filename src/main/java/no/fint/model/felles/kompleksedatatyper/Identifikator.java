// Built from tag v2.2.0

package no.fint.model.felles.kompleksedatatyper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@EqualsAndHashCode
@ToString
public class Identifikator implements FintComplexDatatypeObject {
	private Periode gyldighetsperiode;
	private String identifikatorverdi;
	}
