public class Motor {
    private String naam;
    private int Bouwjaar;
    private int aantalCylinders;
    private int PK;

    public Motor(String naam, int bouwjaar, int aantalCylinders, int PK) {
        this.naam = naam;
        Bouwjaar = bouwjaar;
        this.aantalCylinders = aantalCylinders;
        this.PK = PK;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getBouwjaar() {
        return Bouwjaar;
    }

    public void setBouwjaar(int bouwjaar) {
        Bouwjaar = bouwjaar;
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
