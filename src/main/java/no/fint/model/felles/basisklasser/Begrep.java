// Built from tag v3.1.0-rc-1

package no.fint.model.felles.basisklasser;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Begrep implements FintAbstractObject {
    private Periode gyldighetsperiode;
    @NonNull
    private String kode;
    @NonNull
    private String navn;
    private Boolean passiv;
    @NonNull
    private Identifikator systemId;
}
