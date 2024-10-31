import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/* Def. Klasse als Bean */
@Named
/* Gültigkeitsbereich */
@RequestScoped
public class Co2emission implements Serializable
{
    private String land;
    private String flagge;
    private int emission2020;
    private int emission2021;
    private int emission2022;
    private int emission2023;

    
    
    public Co2emission(String land, String flagge, int emission2020, int emission2021, int emission2022, int emission2023) {
		super();
		this.land = land;
		this.flagge = flagge;
		this.emission2020 = emission2020;
		this.emission2021 = emission2021;
		this.emission2022 = emission2022;
		this.emission2023 = emission2023;
	}


    public String getLand(){
    	return land;
    }

    public void setLand(String land){
    	this.land = land;
    }
    
    public String getFlagge(){
    	return flagge;
    }

    public void setFlagge(String flagge){
    	this.flagge = flagge;
    }
    
    public int getEmission2020(){
    	return emission2020;
    }

    public void setEmission2020(int emission2020){
    	this.emission2020 = emission2020;
    }
    
    public int getEmission2021(){
    	return emission2021;
    }

    public void setEmission2021(int emission2021){
    	this.emission2021 = emission2021;
    }
    
    public int getEmission2022(){
    	return emission2022;
    }

    public void setEmission2022(int emission2022){
    	this.emission2022 = emission2022;
    }
    
    public int getEmission2023(){
    	return emission2023;
    }

    public void setEmission2023(int emission2023){
    	this.emission2023 = emission2023;
    }
}
