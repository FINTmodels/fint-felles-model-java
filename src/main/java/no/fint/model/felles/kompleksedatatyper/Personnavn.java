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
    private String fornavn;
    private String etternavn;
    private String mellomnavn;
}

