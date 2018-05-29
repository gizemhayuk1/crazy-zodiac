public class Element extends Existence{
    private String elementName;

    public void setElementName(String elementName) {
        if(elementName.length()>10)
            elementName="invalid";
        this.elementName=elementName;
    }
    public String getElementName() {
        return elementName;
    }
    public Element(boolean e_existence, int e_year,String e_name) { // parameterized constructor
        super(e_existence,e_year);
        setElementName(e_name);
    }
    public double calculateDiscoverAge() {// the method calculateDiscoverAge was not defined in abstract superclass Existence;
                                          // it is now implemented here in concrete subclass Element

        if(elementName.equals("FIRE"))
        {
            return 3.218;
        }
        else if(elementName.equals("EARTH") || elementName.equals("WATER") || elementName.equals("AIR")){
            return 4.543;
        }
        return 1;

    }

    public void display() {
        super.display();
        System.out.println("The Element of your Zodiac is : " +elementName);
        System.out.println(elementName+" exists for  "+calculateDiscoverAge()+" billion year");
        System.out.println();
    }
}

