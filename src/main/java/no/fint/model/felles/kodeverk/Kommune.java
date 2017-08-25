// Built from tag v1.1.0-rc2

package no.fint.model.felles.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper = false)
public class Kommune extends Begrep {
    public enum Relasjonsnavn {
        FYLKE
    }
}

