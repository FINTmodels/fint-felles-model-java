// Built from tag v2.0.0

package no.fint.model.felles.basisklasser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Begrep {
    private Periode gyldighetsperiode;
    private String kode;
    private String navn;
    private Identifikator systemId;
}

