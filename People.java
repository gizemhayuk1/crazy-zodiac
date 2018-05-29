public class People extends Existence{
    private String fullName;
    private String gender;
    private int birthDay;
    private int birthMonth;
    private WesternZodiac wz;
    private ChineseZodiac cz;

    public void setWz(WesternZodiac wz) {
        this.wz=wz;
    }
    public WesternZodiac getWz() {
        return wz;
    }
    public void setCz(ChineseZodiac cz) {
        this.cz=cz;
    }
    public ChineseZodiac getCz() {
        return cz;
    }
    public void setFullName(String fullName) {
        if(fullName.length()>20) {
            fullName="unknown";
        }
        this.fullName=fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("female" )|| gender.equalsIgnoreCase("male"))
            this.gender=gender;
    }
    public String getGender() {
        return gender;
    }

    public void setBirthDay(int birthDay) {
        if(birthDay<0) /// input validation
           birthDay=1;
        this.birthDay=birthDay;
    }
    public int getBirthDay() {
        return birthDay; }
    public void setBirthMonth(int birthMonth) {
        if(birthMonth>12 || birthMonth<1) // input validation
            birthMonth=1;
        this.birthMonth=birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }
    public People(boolean p_existence, int p_year, String p_name, String p_gender,
                  int p_birthDay, int p_birthMonth,WesternZodiac wz1,ChineseZodiac cz1) { // parameterized constructor
        super(p_existence,p_year);
        setFullName(p_name);
        setGender(p_gender);
        setBirthDay(p_birthDay);
        setBirthMonth(p_birthMonth);
        setWz(wz1);
        setCz(cz1);

    }

    public double calculateDiscoverAge() {// the method calculateDiscoverAge was not defined in abstract superclass Existence;
                                          // it is now implemented here in concrete subclass People
        return 2018-getBirthYear();
    }
    public void display() {
        super.display();
        System.out.println("Name: " +fullName);
        System.out.println("Birth Day: " +birthDay);
        System.out.println("Birth Month: " +birthMonth);
        System.out.println("Gender: " +gender);
        //System.out.println("Western zodiac name of the person is: " +wz.getZodiacName());
        //System.out.println("Chinese zodiac name of the person is: " +cz.getCzName());
        //System.out.println("The element of the this western zodiac is: " + wz.getEl().getElementName());
        //System.out.println("The planet of this western zodiac is: " + wz.getPl().getPlanetName());

    }
}
