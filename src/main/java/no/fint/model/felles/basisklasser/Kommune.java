package no.fint.model.felles.basisklasser;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Kommune extends Begrep {
    public enum Relasjonsnavn {
        FYLKE
    }
}

