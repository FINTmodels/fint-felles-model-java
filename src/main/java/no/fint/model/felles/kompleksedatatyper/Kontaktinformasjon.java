// Built from tag v0.99.9

package no.fint.model.felles.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Kontaktinformasjon implements FintComplexDatatypeObject {
    private String epostadresse;
    private String mobiltelefonnummer;
    private String nettsted;
    private String sip;
    private String telefonnummer;
}
