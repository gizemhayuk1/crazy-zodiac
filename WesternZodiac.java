public class WesternZodiac implements Zodiac {
    private String zodiacName;
    private Element el;
    private Planet pl;

    public void setEl(Element el) {
        this.el=el;
    }
    public Element getEl() {
        return el;
    }
    public void setPl(Planet pl) {
        this.pl=pl;
    }
    public Planet getPl() {
        return pl;
    }

    public void setZodiacName(String zodiacName)
    {
        if(zodiacName.length()>20) // input validation
            zodiacName="invalid";
        this.zodiacName=zodiacName;
    }
    public String getZodiacName() {
        return zodiacName;
    }

    public WesternZodiac(String z_zodiacName,Element z_el,Planet z_pl) { // paramterized constructor
        setZodiacName(z_zodiacName);
        setEl(z_el);
        setPl(z_pl); }
    public void zodiacProperties() {
        System.out.println("\t\t\t\t\t*** More About Western Zodiac ***");
        System.out.println("Western astrology is largely horoscopic, that is, it is a form of divination based on");
        System.out.println("the construction of a horoscope for an exact moment, such as a person's birth, ");
        System.out.println("in which various cosmic bodies are said to have an influence. Astrology in western popular ");
        System.out.println("culture is often reduced to sun sign astrology, which considers only the individual's date ");
        System.out.println("of birth (i.e. the \"position of the Sun\" at that date).");
        System.out.println();
    }
    public void print() {
        System.out.println("                ---WESTERN ZODIAC INFORMATION---");
        System.out.println("Western zodiac name of the person is: " +zodiacName);
        System.out.println("The element of the this western zodiac is: " + el.getElementName());
        System.out.println("The planet of this western zodiac is: " + pl.getPlanetName());
        System.out.println();
    }
}
