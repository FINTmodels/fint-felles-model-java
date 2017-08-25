// Built from tag v1.1.0-rc2

package no.fint.model.felles.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Personnavn {
    private String etternavn;
    private String fornavn;
    private String mellomnavn;
}

