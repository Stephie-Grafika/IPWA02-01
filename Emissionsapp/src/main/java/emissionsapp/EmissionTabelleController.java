package emissionsapp;

import java.io.Serializable;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.util.List;
import java.util.stream.Collectors;
/*import jakarta.persistence.*;*/

@Named
@ViewScoped
public class EmissionTabelleController implements Serializable
{
	@Inject 
	private EmissionTabelle emissionTabelle;
	
	private final EmissionDAO emissionDAO = new EmissionDAO();
	
	// Neue Variable für die Filterung nach Land
    private String suchLand;
    
    // Gefilterte Liste der Emissionen
    private List<Emission> filteredList;
	
    public String startEdit() {
        return "editierbar";
    }
    
    public String stopEdit() {
    	
    	// Speichere die gesamte Liste ohne erneutes Öffnen der EntityManagerFactory
        emissionDAO.saveAll(emissionTabelle.getListe());
    	
    	/* in DAO ausgelagert 
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("emissionPersistenceUnit");
    	EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        
        for (Emission e : emissionTabelle.getListe())
          em.merge(e);
        t.commit(); */
        
        return "vorschau"; // Erfolgreich gespeichert
    }
    
    // Methode zum Hinzufügen einer neuen Emission
    public void addEmission() {
        Emission neueEmission = new Emission(); // Neues Emission-Objekt erzeugen
        emissionTabelle.getListe().add(neueEmission); // Hinzufügen zur Liste
    }

    // Methode zum Löschen einer Emission
    public void deleteEmission(Emission emission) {
        emissionDAO.delete(emission); // Löschen der Emission über die DAO
        emissionTabelle.getListe().remove(emission); // Entfernen aus der Tabelle im Controller
    }
    
    
}
