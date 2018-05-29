public class Planet extends Existence{
    private String planetName;

    public void setPlanetName(String planetName) {
        if(planetName.length()>10) // input validation
            planetName="invalid";
        this.planetName=planetName;
    }
    public String getPlanetName() {
        return planetName;
    }

    public Planet(boolean p_existence,int p_year,String p_planetname) { // paramterized constructor
        super(p_existence,p_year);
        setPlanetName(p_planetname);
    }
    @Override
    public double calculateDiscoverAge() { // the method calculateDiscoverAge was not defined in abstract superclass Existence;
                                            // it is now implemented here in concrete subclass Planet
        if(planetName.equalsIgnoreCase("Mars") || planetName.equalsIgnoreCase("Sun")){
            return 4.603; }
        else if(planetName.equalsIgnoreCase("Saturn") || planetName.equals("Jupiter")|| planetName.equals("Venus")
                || planetName.equals("Uranus")||planetName.equals("Mercury")||planetName.equals("Neptune")){
            return 4.503; }
        else if(planetName.equals("Earth")){
            return 4.543; }
        else if(planetName.equals("Moon")){
            return 4.530; }
        return 1;
    }
    public void display() {
        super.display();
        System.out.println("The planet of your Zodiac is : " +planetName);
        System.out.println(planetName+ " is discovered before " +calculateDiscoverAge()+" billion year");
        System.out.println();
    }
}

