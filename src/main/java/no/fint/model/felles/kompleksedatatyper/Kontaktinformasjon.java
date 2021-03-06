// Built from tag v3.5.0

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
public class Kontaktinformasjon implements FintComplexDatatypeObject {
    private String epostadresse;
    private String mobiltelefonnummer;
    private String nettsted;
    private String sip;
    private String telefonnummer;
}
