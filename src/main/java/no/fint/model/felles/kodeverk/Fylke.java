// Built from tag v2.4.0-rc-4

package no.fint.model.felles.kodeverk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Fylke extends Begrep implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            KOMMUNE
    }

}
