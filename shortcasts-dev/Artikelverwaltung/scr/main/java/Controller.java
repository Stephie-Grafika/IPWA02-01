import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/* Def. Klasse als Bean */
@Named
/* Gültigkeitsbereich */
@ViewScoped
public class Controller implements Serializable 
{
    public String startEdit() {
        return 	"bearbeiten";
    }
    
    public String stopEdit() {
    	return "vorschau";
    }
    
    public String neueSpalte() {
    	return "#";
    }
    
    public String neueZeilee() {
    	return "#";
    }
}