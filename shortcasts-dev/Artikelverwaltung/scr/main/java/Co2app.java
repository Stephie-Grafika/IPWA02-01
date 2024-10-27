import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;

@Named
@ApplicationScoped
public class Co2app implements Serializable {

	private List<Co2emission> landemission = new ArrayList<Co2emission>();

	/* Neue Instanz von Co2app */
	public Co2app() {
		landemission.add(new Co2emission("Deutschland", "🇩🇪", 600, 700, 800, 900));
		landemission.add(new Co2emission("England", "🇬🇧", 400, 500, 600, 700));
		landemission.add(new Co2emission("Schweiz", "🇨🇭", 700, 800, 900, 1000));
	}
	
	public List<Co2emission> getLandemission()
	{
		return landemission;
	}
}
