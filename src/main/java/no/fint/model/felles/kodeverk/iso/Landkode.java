// Built from tag v2.6.0-rc-1

package no.fint.model.felles.kodeverk.iso;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import no.fint.model.*;

import no.fint.model.felles.basisklasser.Begrep;
import no.fint.model.relation.felles.LandkodeRelation;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Landkode extends Begrep implements LandkodeRelation,FintMainObject {
}
