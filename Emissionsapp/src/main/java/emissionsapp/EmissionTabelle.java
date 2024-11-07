package emissionsapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class EmissionTabelle implements Serializable {

    private List<Emission> liste = new ArrayList<Emission>();

    /* Neue Instanz von EmissionTabelle */
    public EmissionTabelle() {
        // Beispiel-Daten 
        liste.add(new Emission("Aruba", "ABW", null, null, null, null));
        liste.add(new Emission(null, null, null, null, null, null));
        
}

    public List<Emission> getListe() {
        return liste;
    }
}