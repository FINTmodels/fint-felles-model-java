package no.fint.model.felles.basisklasser.iso;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Begrep;
import no.fint.model.relation.Identifiable;

@Data
@EqualsAndHashCode(callSuper = false)
public class Kjonn extends Begrep implements Identifiable {
    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }
}

