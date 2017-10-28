// Built from tag v2.2.0

package no.fint.model.felles.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@EqualsAndHashCode
@ToString
public abstract class Begrep implements FintAbstractObject {
	private Periode gyldighetsperiode;
	private String kode;
	private String navn;
	private Identifikator systemId;
	}
