package no.fint.model.felles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adresse {
    private String adresse;
    private String postnummer;
    private String poststed;
    private String land;
}
