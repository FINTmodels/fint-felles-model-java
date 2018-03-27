// Built from tag v2.6.0-rc-1

package no.fint.model.felles.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintComplexDatatypeObject;


@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Adresse implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            LAND
    }

    @NonNull
    private List<String> adresselinje;
    private String postnummer;
    private String poststed;
}
