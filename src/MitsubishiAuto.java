public class MitsubishiAuto extends AbstractVoertuig {
    private String merk = "Mitsubishi";
    private String model;
    private int bouwjaar;
    private Engine engine;
    private String kleur;
    private String nummerplaat;
    private int aantalWielen;
    private String uitvoering;
    private double prijs;

    public MitsubishiAuto(String model, int bouwjaar, Engine engine, String kleur, String nummerplaat, int aantalWielen, String uitvoering, double prijs) {
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.engine = engine;
        this.kleur = kleur;
        this.nummerplaat = nummerplaat;
        this.aantalWielen = aantalWielen;
        this.uitvoering = uitvoering;
        this.prijs = prijs;
    }

    @Override
    public String getdetails() {
        return "Merk: " + merk + "\n" +
                "Model: " + model + "\n" +
                "Bouwjaar: " + bouwjaar + "\n" +
                "Motor: " + engine.getNaam() + "\n" +
                "Kleur: " + kleur + "\n" +
                "Nummerplaat: " + nummerplaat + "\n" +
                "AantalWielen: " + aantalWielen + "\n" +
                "Uitvoering: " + uitvoering + "\n" +
                "prijsLegeAuto: " + prijs + "\n" +
                "prijsVolledigeUitvoering: " + (prijs + this.engine.getPrijs()) + "\n";
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
    public Engine getMotor() {
        return engine;
    }

    @Override
    public void setMotor(Engine engine) {
        this.engine = engine;
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

    @Override
    public double getPrijs() {
        return prijs;
    }

    @Override
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
}
