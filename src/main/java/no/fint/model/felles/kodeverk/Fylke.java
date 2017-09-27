// Built from tag v2.0.0

package no.fint.model.felles.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper=false)
public class Fylke extends Begrep {
	public enum Relasjonsnavn {
			KOMMUNE
	}
}

