package emissionsapp;

import java.io.Serializable;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.*;

@Named
@ViewScoped
public class EmissionTabelleController implements Serializable
{
	@Inject 
	private EmissionTabelle emissionTabelle;
	
    public String startEdit() {
        return "editierbar";
    }
    
    public String stopEdit() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("emissionPersistenceUnit");
    	EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        
        for (Emission e : emissionTabelle.getListe())
          em.merge(e);
        t.commit();
        
        return "vorschau"; // Erfolgreich gespeichert
    }
}
