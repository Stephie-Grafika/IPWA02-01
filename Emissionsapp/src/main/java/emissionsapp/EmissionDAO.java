package emissionsapp;

import java.util.List;
import jakarta.persistence.*;


public class EmissionDAO {
	
	 // Verwende eine einzige EntityManagerFactory während der gesamten Laufzeit
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("emissionPersistenceUnit");
    
    // Methode zum Laden aller Emissionen
    public List<Emission> findAll() {
        EntityManager entityManager = emf.createEntityManager();
        Query abfrage = entityManager.createQuery("select e from Emission e");
        List<Emission> alleEmissionen = abfrage.getResultList();
        
        entityManager.close();
        return alleEmissionen;
    }

    // Methode zum Speichern aller Emissionen
    public void saveAll(List<Emission> emissionen) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            for (Emission emission : emissionen) {
            	entityManager.merge(emission);  // Speichern oder Aktualisieren jedes Emission-Objekts
            }
            transaction.commit();
        } finally {
        	entityManager.close();  // EntityManager schließen, auch wenn eine Exception auftritt
        }
    }

    // Methode zum Hinzufügen einer neuen Emission zur Liste
    public void addEmission(List<Emission> emissionen) {
        Emission neueEmission = new Emission(); // Erstellen eines neuen Emission-Objekts
        emissionen.add(neueEmission); // Zur übergebenen Liste hinzufügen (keine DB-Transaktion)
    }
    
    // Methode zum Löschen einer Emission
    public void delete(Emission emission) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            // Lösch-Operation
            if (!entityManager.contains(emission)) {
                // Wenn das Entity nicht verwaltet wird, muss es geladen werden
                emission = entityManager.merge(emission);
            }
            entityManager.remove(emission); // Löschen der Emission
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Rollback bei Fehler
            }
            throw e; // Fehler erneut werfen
        } finally {
            entityManager.close();
        }
    }
    
    // Methode zum Schließen der EntityManagerFactory (optional)
    public static void close() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
    
    
}

