package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personnavn {
    private String fornavn;
    private String etternavn;
    private String mellomnavn;
}
