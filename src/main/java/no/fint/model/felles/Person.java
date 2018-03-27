// Built from tag v2.6.0-rc-1

package no.fint.model.felles;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.relation.felles.PersonRelation;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.felles.basisklasser.Aktor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Person extends Aktor implements FintMainObject,PersonRelation {
    public enum Relasjonsnavn {
            STATSBORGERSKAP,
            KJONN,
            MALFORM,
            PERSONALRESSURS,
            MORSMAL,
            ELEV
    }

    private String bilde;
    private Adresse bostedsadresse;
    private Date fodselsdato;
    @NonNull
    private Identifikator fodselsnummer;
    @NonNull
    private Personnavn navn;
}
