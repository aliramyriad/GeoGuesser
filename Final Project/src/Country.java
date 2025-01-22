public class Country // class that creates a country variable and stores its method calls
{
    private String Continent;
    private String Name;
    private double Population;
    private String funFact;


    // constructs a country with a continent , name and population
    public Country(String c , String n , double p , String ff)
    {
     Continent = c;
     Name = n;
     Population = p;
     funFact = ff;
    }

    public String getContinent() // returns the continent
    {
        return Continent;
    }

    public String getName() // returns the name
    {
        return Name;
    }

    public double getPopulation() // returns the population
    {
        return Population;
    }

    public String getFunFact() // returns the fun fact
    {
        return funFact;
    }

    public String toString() // returns the information of a country in a string
    {
        return Name + " is a country in " + Continent + " and has a population of "
                + Population + " million people." + " " + funFact;
    }


}
