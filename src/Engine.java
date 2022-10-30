public class Engine {
    private String naam;
    private int bouwjaar;
    private int aantalCylinders;
    private int PK;
    private String brandStof;

    public Engine(String naam, int bouwjaar, int aantalCylinders, int PK, String brandStof) {
        this.naam = naam;
        this.bouwjaar = bouwjaar;
        this.aantalCylinders = aantalCylinders;
        this.PK = PK;
        this.brandStof = brandStof;
    }

    public String getdetails() {
        return "Naam: " + naam + "\n" +
                "Bouwjaar: " + bouwjaar + "\n" +
                "Aantalcylinders: " + aantalCylinders + "\n" +
                "PK: " + PK + "\n" +
                "Brandstof: " + brandStof + "\n";
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(int bouwjaar) {
        bouwjaar = bouwjaar;
    }

    public int getAantalCylinders() {
        return aantalCylinders;
    }

    public void setAantalCylinders(int aantalCylinders) {
        this.aantalCylinders = aantalCylinders;
    }

    public int getPK() {
        return PK;
    }

    public void setPK(int PK) {
        this.PK = PK;
    }
}
