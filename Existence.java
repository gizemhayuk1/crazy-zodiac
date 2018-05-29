public abstract class Existence {
    private boolean physical;
    private int birthYear;

    public Existence(boolean a_physical, int byear){ // parameterized constructor
        setPhysical(a_physical);
        setBirthYear(byear);
    }
    public void setPhysical(boolean physical) {
        this.physical=physical;
    }
    public boolean getPhysical() {
        return physical;
    }

    public void setBirthYear(int birthyear)
    {
        if(birthyear<0 || birthYear>2019) // input validation
            birthyear=0;
        this.birthYear = birthyear;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public abstract double calculateDiscoverAge(); // abstract method is declared but not defined.

    public void display() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t---");
        System.out.println("\t\t\t\t\t*** PEOPLE AND THEIR HOROSCOPE INFORMATION ***");
        System.out.println("Is it a concrete existence? " +physical);
        System.out.println("Birth Year: " +birthYear);
    }
}

