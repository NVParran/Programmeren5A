public class BMWMotor extends AbstractVoertuig {
    private String merk = "Nissan";
    private String model;
    private int bouwjaar;
    private Motor motor;
    private String kleur;
    private String nummerplaat;
    private int aantalWielen;
    private String uitvoering;

    public BMWMotor(String model, int bouwjaar, Motor motor, String kleur, String nummerplaat, int aantalWielen, String uitvoering) {
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.motor = motor;
        this.kleur = kleur;
        this.nummerplaat = nummerplaat;
        this.aantalWielen = aantalWielen;
        this.uitvoering = uitvoering;
    }


    @Override
    public String getdetails() {
        return "Merk: " + merk + "\n" +
                "Model: " + model + "\n" +
                "Bouwjaar: " + bouwjaar + "\n" +
                "Motor: " + motor.getNaam() + "\n" +
                "Kleur: " + kleur + "\n" +
                "Nummerplaat: " + nummerplaat + "\n" +
                "AantalWielen: " + aantalWielen + "\n" +
                "Uitvoering: " + uitvoering + "\n";
    }

    @Override
    public String getMerk() {
        return merk;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getBouwjaar() {
        return bouwjaar;
    }

    @Override
    public Motor getMotor() {
        return motor;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String getKleur() {
        return kleur;
    }

    @Override
    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public String getNummerplaat() {
        return nummerplaat;
    }

    @Override
    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    @Override
    public int getAantalWielen() {
        return aantalWielen;
    }

    @Override
    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    @Override
    public String getUitvoering() {
        return uitvoering;
    }
}
