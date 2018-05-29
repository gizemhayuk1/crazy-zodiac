public class ChineseZodiac implements Zodiac {
    private String czName;

    public void setCzName(String czName) {
        if(czName.length()>10) { // input validation
            czName="invalid";
        }
        this.czName=czName;
    }
    public String getCzName() {
        return czName;

    }
    public ChineseZodiac(String czName) { // parameterized constructor
        setCzName(czName);

    }

    @Override
    public void zodiacProperties() {
        System.out.println("\t\t\t\t\t*** More About Chinese Zodiac ***");
        System.out.println("The Chinese zodiac is based on a 12-year cycle, ");
        System.out.println( "with an animal representing each year. Chinese zodiacs are determined by birth year,");
        System.out.println("so each zodiac gets the spotlight once every 12 years.");
        System.out.println("********");
        System.out.println();
    }

    public void print() {
        System.out.println("                --- CHINESE ZODIAC INFORMATION ---");
        System.out.println("Chinese zodiac name of the person is: : " +czName);
        System.out.println();
    }
}
