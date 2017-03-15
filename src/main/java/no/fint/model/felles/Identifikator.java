package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Identifikator {
    private String identifikatorverdi;
    private Periode gyldighetsperiode;
}
