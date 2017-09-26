// Built from tag v2.0.0

package no.fint.model.felles.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Identifikator {
    private Periode gyldighetsperiode;
    private String identifikatorverdi;
}

