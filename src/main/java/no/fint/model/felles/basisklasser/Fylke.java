package no.fint.model.felles.basisklasser;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Fylke extends Begrep {
    public enum Relasjonsnavn {
        KOMMUNE
    }
}

