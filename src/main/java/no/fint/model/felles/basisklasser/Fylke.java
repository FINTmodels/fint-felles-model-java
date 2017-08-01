package no.fint.model.felles.basisklasser;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.relation.Identifiable;

@Data
@EqualsAndHashCode(callSuper = false)
public class Fylke extends Begrep implements Identifiable {
    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        KOMMUNE
    }
}

