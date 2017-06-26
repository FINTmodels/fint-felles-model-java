package no.fint.model.felles.kompleksedatatyper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Adresse {
    private String adresse;
    private String postnummer;
    private String poststed;
    public enum Relasjonsnavn {
        LAND
    }
}

