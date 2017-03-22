package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class Begrep {
    private Identifikator systemId;
    private String kode;
    private String navn;
    private Periode gyldighetsperiode;
}
