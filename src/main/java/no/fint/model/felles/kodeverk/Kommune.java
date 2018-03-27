// Built from tag v2.6.0-rc-1

package no.fint.model.felles.kodeverk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.relation.felles.kodeverk.KommuneRelation;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Kommune extends Begrep implements FintMainObject,KommuneRelation {
    public enum Relasjonsnavn {
            FYLKE
    }

}
