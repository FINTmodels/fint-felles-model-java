package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Identifikator {
    private String identifikatorverdi;
    private Periode gyldighetsperiode;
}
