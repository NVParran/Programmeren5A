public class ToyotaAuto extends AbstractVoertuig {
    static private String merk = "Toyota";
    private String model;
    private int bouwjaar;
    private Motor motor;
    private String kleur;
    private String nummerplaat;
    private int aantalWielen;

    public ToyotaAuto(String model, int bouwjaar, Motor motor, String kleur, String nummerplaat, int aantalWielen) {
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.motor = motor;
        this.kleur = kleur;
        this.nummerplaat = nummerplaat;
        this.aantalWielen = aantalWielen;
    }

    @Override
    public String getdetails() {
        return "Merk: " + merk + "\n" +
                "Model: " + model + "\n" +
                "Bouwjaar: " + bouwjaar + "\n" +
                "Motor: " + motor.getNaam() + "\n" +
                "Kleur: " + kleur + "\n" +
                "Nummerplaat: " + nummerplaat + "\n" +
                "AantalWielen: " + aantalWielen + "\n";
    }
}
