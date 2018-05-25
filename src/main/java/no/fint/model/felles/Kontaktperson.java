// Built from tag v2.8.0

package no.fint.model.felles;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Kontaktperson implements FintMainObject {
    public enum Relasjonsnavn {
            KONTAKTPERSON,
            PERSON
    }

    @NonNull
    private Boolean foreldreansvar;
    @NonNull
    private Identifikator systemId;
    @NonNull
    private String type;
}
