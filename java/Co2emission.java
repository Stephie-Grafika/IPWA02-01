import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Co2emission
{
    private String land = "Deutschland";

    public Co2emission()
    {
    }

    public String getLand()
    {
        return land;
    }

    public void setLand(String land)
    {
        this.land = land;
    }
}
