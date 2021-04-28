package Country;
import Population.Person;
import Population.Sick;
import Location.Location;


public class City extends Settlement{

    //Default constructor
    public City () {
        super ();
    }

    //constructor get 4 variables
    public City (String name,Location location,int currentPopulation,int maxPopulation)
    {
        super (name,location, currentPopulation, maxPopulation);
    }

    public RamzorColor calculateRamzorGrade() {
        double color = 0.2  * (Math.pow (4, 1.25 * contagiousPercent()));

        //Return the color of the city according to the conditions

        if (color < RamzorColor.GREEN.getFactor())
            return this.setRamzorColor(RamzorColor.GREEN);
        else if (color < RamzorColor.YELLOW.getFactor())
            return this.setRamzorColor(RamzorColor.YELLOW);
        else if (color < RamzorColor.ORANGE.getFactor())
            return this.setRamzorColor(RamzorColor.ORANGE);
        else
            return this.setRamzorColor(RamzorColor.RED);
    }

    @Override
    public String toString() {
        return "City{} " + super.toString();
    }
}